package day23_Arrays;

public class MinNumOfArray {
    public static void main(String[] args) {
        int[] numbers = {10, 5, -27, 4, 400, 50, 0, -1};
        int minNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        System.out.println(minNumber);
    }
}
/*
write a program that can find the minimum number from an array of integers
    ex:
            array = {10,5, 4, 400, 50, 0, -1};
            output: -1
 */
