package day12_Scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.println("enter number: ");
//        float num1 = scan.nextInt();//nextFloat()
//
//        System.out.println(num1);
//        System.out.println("************************************************");
//
//        System.out.println("enter number: ");
//        int num2 =(int) (scan.nextFloat());
//        System.out.println(num2);
//
//        System.out.println("************************************************");


        System.out.println("enter NAME: ");
        String name = scan.next();
        System.out.println(name);

        scan.nextLine();

        System.out.println("enter SENTENCE: ");
        String sentence = scan.nextLine();
        System.out.println(sentence);




//      try {
//          float num1 = scan.nextInt();//nextFloat();
//          System.out.println(num1);
//      }catch (RuntimeException a){
//          System.out.println(" Wrong data type you entered");
//      }


//                num2 = scan.nextInt();
//        float num3 = scan.nextFloat(); //0.0 1.5
//
//        int addition = num1 + num2;
//        int subtraction = num1 - num2;
//        int multiplication = num1 * num2;
//        int division = num1/num2;
//
//        System.out.println("addition = " + addition);
//        System.out.println("subtraction = " + subtraction);
//        System.out.println("multiplication = " + multiplication);
//        System.out.println("division = " + division);

    }
}
