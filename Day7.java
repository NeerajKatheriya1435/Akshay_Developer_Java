
class HumanBase{
//    String name;
//    float salary;

    void run(){
        System.out.println("Employee can run");
    }
    void walk(){
        System.out.println("Employee can walk");
    }
}

class Player extends HumanBase{
    void play(){
        System.out.println("Employee can play");
    }
}

public class Day7 {
    public static void main(String[] args) {

//        HumanBase h1=new HumanBase();
//        h1.run();
//        h1.play();
//        h1.walk();

        Player p1=new Player();
        p1.run();
        p1.play();
    }
}
