//
class Mythread1 extends Thread{

    public Mythread1(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 2225; i++) {
            System.out.println("Chatting with someone"+super.getName());
        }
    }
}
class Mythread2 extends Thread{
    public Mythread2(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 1; i <= 2225; i++) {
            System.out.println("Cooking the food"+super.getName());
        }
    }
}

//class Task1 implements Runnable {
//    public void run() {
//        for (int i = 1; i <= 225; i++) {
//            System.out.println("Task1 running: " + super.getClass());
//        }
//    }
//}
//
//class Task2 implements Runnable {
//    public void run() {
//        for (int i = 1; i <= 225; i++) {
//            System.out.println("Task2 running: " + super.getClass());
//        }
//    }
//}

public class Day14 {
    public static void main(String[] args) {

//        Mythread1 t1=new Mythread1();
//        t1.start();
//        Mythread2 t2=new Mythread2();
//        t2.start();
//        for (int i = 1; i <= 2225; i++) {
//            System.out.println("Main is Runnining");
//        }

//        Task1 task1 = new Task1();
//        Task2 task2 = new Task2();
//
//        Thread t1=new Thread(task1);
//        Thread t2=new Thread(task2);

//        t1.start();
//        try {
////            t1.join();
//            t1.sleep(5000);
//        } catch (Exception e){
//            System.out.println("Error Ocurred");
//        }
//
//        t2.start();

        Mythread1 t1=new Mythread1("Abhishek1");
        Mythread1 t2=new Mythread1("Akshay2");

        t1.start();
        t2.start();

    }
}
