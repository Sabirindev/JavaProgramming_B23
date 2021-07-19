package day29_ReturnMethods;

import java.util.Arrays;

public class ReturnMethodsPractice {
    public static void main(String[] args) {
        //find max number between 10 & 20, then multiply it by 2
        int max = max(10, 20);
        System.out.println("max: "+max);
        System.out.println(2 * max);
        //************************
        int min = min(30, 50);
        System.out.println("min: "+min);
    }

    public static int max(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        } else if (b > a) {
            max = b;
        } else {
            //max =a;
            max = b;
        }
        return max;
    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }
}
