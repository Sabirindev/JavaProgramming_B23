package VII.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class RM_String_removeDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(uniqueChars(scan.next()));
    }

    public static String uniqueChars(String str){
        String result = "";
        //System.out.println(Arrays.toString(str.split("")));
        for (String each : str.split("")) {
            if (!result.contains(each)){
                result += each;
            }
        }
        return result;
    }
}
/*
uniqueChars is a method that will accept any String and
return the String with out any dupclicate characters

Examples:

uniqueChars("java") ==> "jav"
uniqueChars("mama") ==> "ma"
uniqueChars("spoon") ==> "spon"
 */
