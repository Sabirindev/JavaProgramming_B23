package VII.Methods;

import java.util.Scanner;

public class RM_void_PrintUniqueNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
        scan.close();

    }
    public static void printUniqueNumbers(int[] nums){

        for (int num1 : nums) {
            int count = 0;
            for (int num2 : nums) {
                if (num1 == num2){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(num1);
            }
        }

    }
}
/*
Complete a void method printUniqueNumbers() that will print all unique numbers from an array of ints.
Every single unique int should be printed from the new line.

Example:

input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
output 2 , 9, 34
 */
