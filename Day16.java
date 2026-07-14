
//class MyException extends Exception{

//    public MyException(String msg){
//        super(msg);
//    }
//
//    @Override
//    public String getMessage() {
//        return super.getMessage();
//    }

//    @Override
//    public String toString() {
//        return "Not a good boy";
//    }
//}

public class Day16 {

//    static int divide(int num1,int num2) throws ArithmeticException {
//        int a = 0;
//        try {
//            a = num1 / num2;
//
//        } catch (ArithmeticException e) {
//            System.out.println("Can not divide by zero");
//        }
//        return a;
//    }



    public static void main(String[] args) {

//        int age=15;

//        if (age<0){
//            throw new MyException("Age is invalid");
//        }

//        if (age>18){
//            System.out.println("You can drive car");
//        }else{
//            System.out.println("You can not drive the car");
//        }

//        try{
//            throw new MyException("Error Occured");
//        } catch (MyException e) {
//            throw new MyException("Not Valid "+e.getMessage());
////            throw new MyException("Not Valid"+e.toString());
//        }

//        System.out.println(divide(17,6));
//        int a=8;
//        int c;
//        int arr[]=new int[5];
        int age=56;

        try
        {
            if(age<0){
                System.out.println("Age is Invalid");
                throw new ArithmeticException("Value Error");
            }
        }catch (Exception e){
            System.out.println("Can not run");
        }finally {
            System.out.println("Important Line veri Imp");
        }

        if (age>18){
            System.out.println("You can drive the car");
        }else{
            System.out.println("You can not drive the car");
        }



    }
}
