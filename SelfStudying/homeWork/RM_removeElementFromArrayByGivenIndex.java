package homeWork;

import java.util.Arrays;
import utilities.ArraysUtility;

public class RM_removeElementFromArrayByGivenIndex {
    public static void main(String[] args) {
        int[] numbers = {100,200,300,400,500,600};
        System.out.println(Arrays.toString(numbers));

        numbers = removeElement(numbers,3);
        System.out.println(Arrays.toString(numbers));

        System.out.println("--------------------------------");

        double[] array1 = {6.5, 7.5, 8.5, 9.5};     // index 2
        System.out.println(Arrays.toString(array1));

        array1 = removeElement(array1, 2);    //  {6.5, 7.5, 9.5}

        System.out.println(Arrays.toString(array1));

        System.out.println("----------------------------------------------------");

        String[] students = {"Dilem", "Aysu", "Mucahit", "Tugba", "Fhilipp"};  // index 2

        students = removeElement(students, 2); // [Dilem, Aysu, Tugba, Fhilipp]

        System.out.println(Arrays.toString(students));

        students = removeElement(students, 3);

        System.out.println(Arrays.toString(students));

        System.out.println("***********************************");
        char[] chars1 = {'A','B','C','D','E'};
        char[] chars2 = {'F','G','H','I','J'};

        char[] chars3 = ArraysUtility.mergeSameSize(chars1,chars2);

        System.out.println(Arrays.toString(chars3));
    }

    //****************************************************
    //****************************************************
    //****************************************************


    //remove the element at given index of the int array
    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index >= array.length){
            System.out.println("Invalid index");
            System.exit(0);
        }
        int[] arr = new int[array.length-1];

        for (int i = 0, j =0; i < array.length; i++) {
            if (i== index){
                continue;
            }else {
                arr[j++] = array[i];
            }
        }
        return arr;
    }


    // remove the element at given index of the double array
    public static double[] removeElement(double[] array, int index){

        if(index < 0 || index > array.length -1 ){ // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        double[] result = new double[array.length-1];

        for(int i = 0, j = 0; i < array.length; i++ ){
            if(i == index){ // stores all the elements of array except the element at given index
                continue;
            }else{
                result[j++]  = array[i];
            }
        }

        return result;
    }

    // remove the element at given index of the String array
    public static String[] removeElement(String[] array, int index){

        if(index < 0 || index > array.length -1 ){ // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        String[] result = new String[array.length-1];

        for(int i = 0, j = 0; i < array.length; i++ ){
            if(i == index){ // stores all the elements of array except the element at given index
                continue;
            }else{
                result[j++]  = array[i];
            }
        }

        return result;
    }

    // remove the element at given index of the char array
    public static char[] remove(char[] array, int index){

        if(index < 0 || index > array.length -1 ){ // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        char[] result = new char[array.length-1];

        for(int i = 0, j = 0; i < array.length; i++ ){
            if(i == index){ // stores all the elements of array except the element at given index
                continue;
            }else{
                result[j++]  = array[i];
            }
        }

        return result;
    }

}

/*
Task 1:
    1. create a method that can reverse an array of integer

    2. create a method that can reverse an array of double

    3. create a method that can reverse an array of String

    4. create a method that can reverse an array of char
 */
