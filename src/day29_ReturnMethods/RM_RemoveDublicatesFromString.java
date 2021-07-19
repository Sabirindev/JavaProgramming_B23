package day29_ReturnMethods;

import java.util.Arrays;

public class RM_RemoveDublicatesFromString {
    public static void main(String[] args) {
        String result = "AABBBBCCCCCC";

        String[] arr = result.split(""); // creating String[] array from string(result)
        char[] arr2 = result.toCharArray(); // creating char[] array from string(result)

        System.out.println("String[] arr = "+Arrays.toString(arr)); //printing String[] array which is arr
        System.out.println("char[] arr = "+Arrays.toString(arr2));//printing char[] array which is arr2


        System.out.println(result); // printing String result
        result = removeDiblicates(result); // assiging string value which is returning from custom method
                                            // removeDiblicates(result) to the result varibale
        System.out.println(result); // printing String value which is returning from removeDiblicates(result) method


    }

    public static String removeDiblicates(String str){ //"AABBBBCCCCCC
        String result =""; //ABC

        System.out.println("*********** by ForEachLoop *************");
        for (String each : str.split("")) {  //{"A", "A"....."C"}
            if (!result.contains(each)){ //if the character is not contained in the result
                result += each; //add the character into result
            }
        }
//        System.out.println("*********** by For Loop ******************");
//        for (int i = 0; i < str.length()-1; i++) {
//            if (!result.contains(str.substring(i,i+1))){ //if the character is not contained in the result
//                result += str.substring(i,i+1); //add the character into result
//            }
//        }
        return result;
    }
}
