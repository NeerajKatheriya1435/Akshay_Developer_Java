
//interface cam{
//    void audiorecord();
//    void videorecord();
//}
//
//interface superCam extends cam{
//    void hdRecord();
//}
//
//class MobilePhone implements superCam{
//
//    @Override
//    public void hdRecord() {
//        System.out.println("Can Record Video in HD");
//    }
//
//    @Override
//    public void audiorecord() {
//        System.out.println("Can Record Audio");
//    }
//
//    @Override
//    public void videorecord() {
//        System.out.println("Can record Simple video");
//    }
//
//    void greet(){
//        System.out.println("Good Morning");
//    }
//}

import org.w3c.dom.css.Rect;

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}



public class Day13 {
    public static void main(String[] args) {

//        MobilePhone m1= new MobilePhone();
//        m1.audiorecord();
//        m1.greet();
//        m1.hdRecord();

//        cam c1= new MobilePhone();
//        c1.audiorecord();
//        c1.videorecord();

//        superCam c1= new MobilePhone();
//        c1.audiorecord();
//        c1.videorecord();
//        c1.hdRecord();

//        Circle c1=new Circle();
//        Rectangle c2=new Rectangle();
//
//        c1.draw();
//        c2.draw();

    }
}
