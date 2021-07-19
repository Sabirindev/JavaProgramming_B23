package day25_Arrays_forEachLoop;

import java.util.Arrays;

public class ReverseElement2 {
    public static void main(String[] args) {
        String[] array = {"Java", "Python", "C#", "Cybertek", "School", "Selenium", "API"};
        String reversedArray[] = new String[array.length];

        int j =0;
        for (String element : array) {

            String reverse = "";
            for (int i = element.length()-1; i >=0 ; i--) { // index numbers of the String
                reverse += element.charAt(i); // gets the characters from the string element
                // this inner loop is responsible for reversing the string
            }
            reversedArray[j++] = reverse;
            System.out.println(reverse);
        }
        System.out.println(Arrays.toString(reversedArray));
    }
}
