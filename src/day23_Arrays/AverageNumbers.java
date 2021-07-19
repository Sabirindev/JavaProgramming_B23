package day23_Arrays;

import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number do you want to enter?");
        int[] numbers = new int[scan.nextInt()];

        int sum =0;
        //int counter =0;

        for (int i = 0; i < numbers.length; i++) { // used for getting the user iputs and store it into the array
            System.out.println("Enter a number(element into array)");
            numbers[i] = scan.nextInt(); // assiging user input to the indexes of the array
            sum += numbers[i];
            //counter++;
        }
        System.out.println("Sum = "+sum);
        //System.out.println("counter = "+counter);

        double average = (double) sum/numbers.length;
        System.out.println("Average = "+average);
    }
}
