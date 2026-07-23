import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.awt.event.MouseEvent; 

import javax.swing.table.DefaultTableModel;


class StudentManagementGUI extends JFrame implements ActionListener {

    JLabel lblTitle,lblId,lblCourse,lblName,lblMarks;
    JTextField txtId,txtCourse,txtName,txtMarks;
    JButton btnAdd,btnUpdate,btnDelete,btnSearch,btnClear;

    DefaultTableModel model;
    JTable table;

    Student s2=new Student(101, "Rohan", "B.Tech", 566);
    Student s3=new Student(102, "Aman", "Diploma", 345);
    Student s4=new Student(103, "Rakesh", "B.Tech", 576);
    StudentManagement manager=new StudentManagement();

    public StudentManagementGUI(){
        setTitle("My Simple Heading");
        setSize(900,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        Font f1=new Font("Arial",Font.BOLD,24);
        Font f2=new Font("Arial",Font.BOLD,16);

        lblTitle=new JLabel("Student Management App");
        lblTitle.setFont(f1);
        lblTitle.setBounds(180,10,500,40);
        add(lblTitle);

        lblId=new JLabel("Student ID");
        lblId.setFont(f2);
        lblId.setBounds(30,70,120,20);
        add(lblId);

        txtId = new JTextField();
        txtId.setBounds(150, 70, 180, 30);
        add(txtId);

        lblName = new JLabel("Student Name");
        lblName.setFont(f2);
        lblName.setBounds(30, 110, 120, 30);
        add(lblName);

        txtName = new JTextField();
        txtName.setBounds(150, 110, 180, 30);
        add(txtName);

        lblCourse = new JLabel("Course");
        lblCourse.setFont(f2);
        lblCourse.setBounds(30, 150, 120, 30);
        add(lblCourse);

        txtCourse = new JTextField();
        txtCourse.setBounds(150, 150, 180, 30);
        add(txtCourse);

        lblMarks = new JLabel("Marks");
        lblMarks.setFont(f2);
        lblMarks.setBounds(30, 190, 120, 30);
        add(lblMarks);

        txtMarks = new JTextField();
        txtMarks.setBounds(150, 190, 180, 30);
        add(txtMarks);

        btnAdd = new JButton("Add");
        btnAdd.setBounds(30, 250, 100, 35);
        add(btnAdd);

        btnUpdate = new JButton("Update");
        btnUpdate.setBounds(140, 250, 100, 35);
        add(btnUpdate);

        btnDelete = new JButton("Delete");
        btnDelete.setBounds(250, 250, 100, 35);
        add(btnDelete);

        btnSearch = new JButton("Search");
        btnSearch.setBounds(30, 300, 150, 35);
        add(btnSearch);

        btnClear = new JButton("Clear");
        btnClear.setBounds(200, 300, 150, 35);
        add(btnClear);

        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Course");
        model.addColumn("Marks");

        table = new JTable(model);
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(380, 70, 430, 350);

        add(pane);

        btnAdd.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnDelete.addActionListener(this);
        btnSearch.addActionListener(this);
        btnClear.addActionListener(this);

        table.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                int row = table.getSelectedRow();
                txtId.setText(model.getValueAt(row, 0).toString());
                txtName.setText(model.getValueAt(row, 1).toString());
                txtCourse.setText(model.getValueAt(row, 2).toString());
                txtMarks.setText(model.getValueAt(row, 3).toString());

            }
        });

        setVisible(true);
    }

    

    void refreshTable() {

        model.setRowCount(0);
        ArrayList<Student> list = manager.getAllStudent();

        for (Student s : list) {

            model.addRow(new Object[] {
                    s.getId(),
                    s.getName(),
                    s.getCourse(),
                    s.getMarks()
            });

        }

    }

    void clearFields() {

        txtId.setText("");
        txtName.setText("");
        txtCourse.setText("");
        txtMarks.setText("");

        txtId.requestFocus();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        // ADD STUDENT
        if (e.getSource() == btnAdd) {

            try {

                int id = Integer.parseInt(txtId.getText());
                String name = txtName.getText();
                String course = txtCourse.getText();
                double marks = Double.parseDouble(txtMarks.getText());

                if (manager.searchStudent(id) != null) {
                    JOptionPane.showMessageDialog(this, "Student ID Already Exists!");
                    return;
                }

                manager.addStudents(new Student(id, name, course, marks));

                refreshTable();
                clearFields();

                JOptionPane.showMessageDialog(this, "Student Added Successfully.");

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(this, "Enter Valid Data.");

            }
        }

                // DELETE STUDENT
        else if (e.getSource() == btnDelete) {

            try {

                int id = Integer.parseInt(txtId.getText());

                if (manager.deleteStudent(id)) {

                    refreshTable();
                    clearFields();

                    JOptionPane.showMessageDialog(this, "Student Deleted Successfully.");

                } else {

                    JOptionPane.showMessageDialog(this, "Student Not Found.");

                }

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(this, "Enter Student ID.");

            }

        }

                // SEARCH STUDENT
        else if (e.getSource() == btnSearch) {

            try {

                int id = Integer.parseInt(txtId.getText());

                Student s = manager.searchStudent(id);

                if (s != null) {

                    txtName.setText(s.getName());
                    txtCourse.setText(s.getCourse());
                    txtMarks.setText(String.valueOf(s.getMarks()));

                    JOptionPane.showMessageDialog(this, "Student Found.");

                } else {

                    JOptionPane.showMessageDialog(this, "Student Not Found.");

                }

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(this, "Enter Student ID.");

            }

        }

        // UPDATE STUDENT
        else if (e.getSource() == btnUpdate) {

            try {

                int id = Integer.parseInt(txtId.getText());

                String name = txtName.getText();
                String course = txtCourse.getText();
                double marks = Double.parseDouble(txtMarks.getText());

                
                if (manager.updateStudent(id, name, course, marks)) {

                    refreshTable();
                    clearFields();

                    JOptionPane.showMessageDialog(this, "Student Updated Successfully.");

                } else {

                    JOptionPane.showMessageDialog(this, "Student Not Found.");

                }

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(this, "Enter Valid Data.");

            }

        }

        // SEARCH STUDENT
        else if (e.getSource() == btnSearch) {

            try {

                int id = Integer.parseInt(txtId.getText());

                Student s = manager.searchStudent(id);

                if (s != null) {

                    txtName.setText(s.getName());
                    txtCourse.setText(s.getCourse());
                    txtMarks.setText(String.valueOf(s.getMarks()));

                    JOptionPane.showMessageDialog(this, "Student Found.");

                } else {

                    JOptionPane.showMessageDialog(this, "Student Not Found.");

                }

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(this, "Enter Student ID.");

            }

        }

        // CLEAR
        else if (e.getSource() == btnClear) {

            clearFields();

        }
    }

    public static void main(String[] args) {
        
        StudentManagementGUI d1=new StudentManagementGUI();
    }
    
}
