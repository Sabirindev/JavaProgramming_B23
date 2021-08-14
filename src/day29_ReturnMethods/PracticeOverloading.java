package day29_ReturnMethods;

import java.lang.reflect.Array;

public class PracticeOverloading {
    public static void main(String[] args) {
     method1();
     method1(5);
     System.out.println(method1(5, 10));

     int[] array1 = {1,2,5};
     method1(array1);

    }

    //custom
    public static void method1(){
        System.out.println();
        System.out.println("method1 without parameter");
    }

    public static void method1(int a){

        a = 10;
        System.out.println("method1 with one parameter "+a);
    }

    public static int method1(int a, int b){
        System.out.println(" method1 with two parameters");
        return a+b;
    }

    public static void method1(int[] arr){
        System.out.println("method1 with array");
    }
}
