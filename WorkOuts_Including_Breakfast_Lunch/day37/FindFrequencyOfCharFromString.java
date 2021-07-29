package day37;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindFrequencyOfCharFromString {
    public static void main(String[] args) {
        String str ="AABBCCDDEE";
        String result = ""; //A2B2C2D2E2
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(list2);

        for (String each : StringUtility.removeDup(str).split("")) { //each:  A, B, C, D, E
            int frequency = Collections.frequency(list2, each);           //  2  2  2  2  2
            result += each + frequency;
        }

        System.out.println(list2);
        System.out.println(result);

    }
}
/*
3. write a program that can find the frequency of character from a String
                DO NOT use nested loop
                "AABBCCDDEE"  ==> "ABCDE"
                output: A2B2C2D2E2
 */
