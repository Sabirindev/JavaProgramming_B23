package day23_Arrays;

public class MaxNumOfArray {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 4, 400, 50, 0, -1};
        int maxNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        System.out.println(maxNumber);
    }
}

/*
 write a program that can find the maximum number from an array of integers
    ex:
            array = {10,5, 4, 400, 50, 0, -1};
            output: 400

 */

