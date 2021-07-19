package day24;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = {1,6,2,3,3,4};

        for (int j = 0; j < arr.length; j++) {

            int element = arr[j]; //1
            int count = 0; // to store the frequency of element

            for (int i = 0; i < arr.length; i++) { //used for finding the frequesncy of one element
                if (arr[i] == element) { // if the elment is occured in the array(arr)
                    count++;
                }
            }
            if (count == 1) { // if the element is unique
                System.out.println(element + " is unique");
            }
        }
    }
}
/*
 write a program that can print out the unique numbers from an array of integers
        Ex:
            int[] arr ={1,1,2,3,3,4}

            output:
                2 4
 */
