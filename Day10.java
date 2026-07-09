
class Human1 {
    public String name;
    public int age;

    public void greet(){
        System.out.println("Good Morning");
    }
    public void laugh(){
        System.out.println("Good Laughing");
    }
}

class Employee1 extends Human1{

    @Override
    public void greet(){
        System.out.println("Good afternoon");
    }
    public void run(){
        System.out.println("Good Running");
    }
}


public class Day10 {

    public static void main(String[] args) {
//        Human1 e1= new Human1();
//        e1.greet();

//        Employee1 e2= new Employee1();
//        e2.greet();

//        Human1 h1= new Employee1();
//        Employee1 h2=new Human1();
//        h1.greet();
//        h1.laugh();
//        h1.run();

    }


}
