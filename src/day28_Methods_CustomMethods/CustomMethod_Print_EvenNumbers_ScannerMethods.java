package day28_Methods_CustomMethods;

import java.util.Scanner;

public class CustomMethod_Print_EvenNumbers_ScannerMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int from1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int to1 = scan.nextInt();

        evenNumbers(from1,to1);
        scan.close();
    }
    public static void evenNumbers(int from, int to){
        System.out.print("Between "+from+" and "+to+", Even numbers are ");
        for (int i = from; i <= to; i++) {
            if(i%2== 0){
                System.out.print(+i+",");
            }
        }
    }
}
/*
2. create a method that can print even numbers between given numbers
 */
