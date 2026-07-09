
class Employee{

    public String name="Rohan";
    private int age;
    protected float salary=89000;
//    private String age=78;
    Employee(){};
    Employee(String name){
        this.name=name;
    }
    public void details(){
        System.out.println("My name is name is: "+name);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name.length()>3){
            this.name=name;
        }
    }
}

class Programmer extends Employee{
    public void getData(){
        System.out.println("Hello Data "+salary);
    }
}

public class Day8 {
    public static void main(String[] args) {

//        Employee e1=new Employee();
//        System.out.println(e1.name);
//        Employee e2=new Employee();
//        e2.name="Seeta";

//        Employee e1=new Employee("Rohan");
//        System.out.println(e1.name);
//
//        Employee e2=new Employee("Suman");
//        System.out.println(e2.name);
//
//        Employee e3=new Employee();
//        e3.name="Geeta";
//        System.out.println(e3.name);

//        Employee e1=new Employee("Rohan");
//        e1.setName("Geeta");
//        System.out.println(e1.getName());
//        System.out.println(e1.age);
//        e1.name="we";
//        System.out.println(e1.name);

//        Programmer p1=new Programmer();
//        p1.getData();
    }
}
