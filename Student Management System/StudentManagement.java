import java.util.ArrayList;

public class StudentManagement {

    private ArrayList<Student> myStudents;

    public StudentManagement(){
        myStudents=new ArrayList<>();
    }


    public void addStudents(Student student){
        myStudents.add(student);
    }

    public ArrayList<Student> getAllStudent(){
        return myStudents;
    }

    public Student searchStudent(int id){

        for(Student item:myStudents){
            if(item.getId()==id){
                return item;
            }
        }
        return null;
    }

    public boolean deleteStudent(int id){
        
        Student student=searchStudent(id);
        if(student!=null){
            myStudents.remove(student);
            return true;
        }
        return false;
    }

    public boolean updateStudent(int id,String name,String course,double marks){
        
        Student student=searchStudent(id);

        if(student!=null){
            student.setName(name);
            student.setCourse(course);
            student.setMarks(marks);
            return true;
        }
        return false;
    }

    public boolean isIdExists(int id) {

        for (Student student : myStudents) {

            if (student.getId() == id) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        
        // StudentManagement m1=new StudentManagement();

        // Student s2=new Student(101, "Rohan", "B.Tech", 566);
        // Student s3=new Student(102, "Aman", "Diploma", 345);
        // Student s4=new Student(103, "Rakesh", "B.Tech", 576);

        // m1.addStudents(s2);
        // m1.addStudents(s3);
        // m1.addStudents(s4);
        // Student new1=m1.searchStudent(s2.getId());
        // System.out.println(new1.getName());

    }
}
