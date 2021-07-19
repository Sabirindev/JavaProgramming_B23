package VII.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class RM_String_Cover {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(coverString(scan.nextLine(), scan.nextLine()));

    }
    public static String coverString(String main, String coverME){
        String result = "";
        if (!main.contains(coverME)){
            result = "["+main+"]";
        }else {
            result = main.replace(coverME,"["+coverME+"]");
        }
        return result;

    }
}
/*
The coverString method will take 2 string parameters from the caller.

Your job is to write an important code that will :
    to search and find each appearance of coverME within main
    then surround it with square brackets [coverMe]
    if you cannot find the coverME within main then just return whole main itself covered [main].
    keep in mind that coverME value can be of any length.

    Examples:

    coverString("java methods", "me") ) ; ==> "java [me]thods"
    coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"
    coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"
    coverString("apples", "pears") ) ; ==> "[apples]"
 */
