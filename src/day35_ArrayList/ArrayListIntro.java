package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {
        int[] nums = new int[10]; // size is 10 fixed
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[2]);

        System.out.println("**************** ArrayList **************************");


        ArrayList<Integer> numbers = new ArrayList<>();//size is zero
        System.out.println(numbers);
        numbers.add(10);// autoboxing, 0
        numbers.add(20);// 1
        numbers.add(30);// 2
        numbers.add(40);// 3

        System.out.println(numbers);
        System.out.println("size was "+numbers.size());

         //index                             0  1  2  3
        numbers.add(0,70); // [10,20,30,40]
             // index                     0   1  2  3  4
        System.out.println(numbers);  // [70,10,20,30,40]

        System.out.println(numbers.get(2)); //20

        System.out.println("Size is "+numbers.size());

        System.out.println("***************By using For Loop ***********************");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("*************** For Each Loop ***********************");

        for (Integer number : numbers) {
            System.out.println(number);
        }


    }
}
