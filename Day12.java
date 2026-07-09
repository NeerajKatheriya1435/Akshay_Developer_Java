
interface camera{
    void audiorecord();
    void videorecord();
}
interface connectivity{
    void bluetooth();
    void wifi();
}

class Phone implements camera,connectivity{

    @Override
    public void audiorecord() {
        System.out.println("Can Record Audio");
    }

    @Override
    public void videorecord() {
        System.out.println("Can Record Video");
    }

    @Override
    public void bluetooth() {
        System.out.println("Can Connect with blt");
    }

    @Override
    public void wifi() {
        System.out.println("Can connect with wifi");
    }

    static void hello(){
        System.out.println("hello");
    }
}

public class Day12 {
    public static void main(String[] args) {

//        Phone p1=new Phone();
//        p1.audiorecord();
//        p1.wifi();

//        connectivity p1=new Phone();
//        p1.audiorecord();
//        p1.wifi();
//        p1.bluetooth();
//        Phone.hello();


    }
}
