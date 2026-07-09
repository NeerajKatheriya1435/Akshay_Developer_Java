
class Human{
    public String name;
    public int age;

//    Human(){}
    Human(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Supper Constructor");
    };

    public void greet(){
        System.out.println("Good Morning");
    }
}

class Teacher extends Human{

    public int salary;
    Teacher(String name,int age,int salary1){
        super(name,age);
        salary=salary1;
        System.out.println("After Super");
    }
    public void teach(){
        System.out.println("Human Can Teach");
        super.greet();
        System.out.println(super.name);
    }
}
public class Day9 {
    public static void main(String[] args) {
            Human h1=new Human("John",67);
            System.out.println(h1.name);
            System.out.println(h1.age);

            Teacher t1=new Teacher("Shubham",45,23000);
            t1.teach();
    }
}
