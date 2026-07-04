import java.lang.reflect.Array;
import java.util.Arrays;

public class Day4 {

//    static int addTwoNum(int num1,int num2){
//        System.out.println("The sum is: "+(num1+num2));
//        return (num1+num2);
//    }
//    static void greet(){
//        System.out.println("Good Morning");
//    }

//    static void addTwoNum(int num1,int num2){
//        System.out.println("The Sum is: "+(num1+num2));
//    }
//    static void addTwoNum(int num1,int num2,int num3){
//        System.out.println("The Sum is: "+(num1+num2+num3));
//    }
//    static void addTwoNum(float num1,float num2,float num3){
//        System.out.println("The Sum is: "+(num1+num2+num3));
//        System.out.println("Yahi Function hoga for float");
//    }

    static void addTwoNum(int...num){

        int sum=0;
        for (int i = 0; i < num.length ; i++) {
            sum=sum+num[i];
        }
        System.out.println("The sum is: "+sum);
    }
    static void addTwoNum(float...num){

        float sum=0;
        for (int i = 0; i < num.length ; i++) {
            sum=sum+num[i];
        }
        System.out.println("The sum is: "+sum);
    }

    public static void main(String[] args) {

//        int[] arr={4,6,7,4,3,5,6};
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.binarySearch(arr,7));

//        int[] a1 = {1, 2, 5};
//        int[] a2 = {1, 2, 3};
//        System.out.println(Arrays.equals(a1, a2)); // true
//        int[] arr=new int[5];
//        Arrays.fill(arr,6);
//        System.out.println(Arrays.toString(arr));

//        int a=6;
//        int b=5;
//        System.out.println(a+b);
//
//        int a1=9;
//        int b1=7;
//        System.out.println(a1+b1);

//        System.out.println(addTwoNum(5,8));
//        Day4 d1=new Day4();
//        d1.greet();

//        addTwoNum(6,7);
//        addTwoNum(6,5);
//        addTwoNum(6,7,8);
//        addTwoNum(6.5f,7.7f,8.2f);
        addTwoNum(3,4);
        addTwoNum(3,6,8);
        addTwoNum(3,6,8,8);

    }
}
