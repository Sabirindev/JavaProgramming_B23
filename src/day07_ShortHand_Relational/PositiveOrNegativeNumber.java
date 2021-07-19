package day07_ShortHand_Relational;

import java.util.Scanner;

public class PositiveOrNegativeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter the integer number: ");
        int number = scan.nextInt();

        boolean isNumberPositive = number > 0, isNumberNegative = number < 0,
                isNumberZero = number ==0;


        System.out.println(number+" is positive number: "+isNumberPositive+"\n"+number+" is positive number: "+isNumberNegative
                                +"\n"+number+" is positive number: "+isNumberZero);



    }
}
