package arraysClass;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        String[] str = {"Sabir", "Ramin", "Selena"}; // length : 3

        for (int i = 0; i <= str.length - 1; i++) {
            System.out.println(str[i].substring(0, 1) + str[i].substring(str[i].length() - 1));
        }

        System.out.println("*************Quiz question I made mistake ***********");

        int arr1[] = {1,2,3}; // arr1's size is 3
        int arr2[] = {5,6,7,8,9}; // arr2's size is 5

        arr1 = arr2; // after assigning , arr1 gets arr's element(5,6,7,8,9) and its size(5)
                    //then arr1's size is 5, not 3

        System.out.println(Arrays.toString(arr1)); // [5,6,7,8,9] size is 5
    }
}
