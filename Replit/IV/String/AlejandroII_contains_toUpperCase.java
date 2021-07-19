package IV.String;

import java.util.Locale;
import java.util.Scanner;

public class AlejandroII_contains_toUpperCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine().toUpperCase();

        String result = "";
        if (sentence.contains("alejandro".toUpperCase()) && sentence.contains("project".toUpperCase())){
            result = "read";
        }else {
            result = "don't read";
        }
        System.out.println(result);
        scan.close();
    }
}
/*
Alejandro has many emails and only has time to read the emails that refer to him and a project. Check if his name is found in the email and if project is also included and if it does print "read", but if his name is not in the email print "don't read"

Example:

a = "dear alejandro.....alot of text"
output: "don't read"

a = "thunder blaz is the best drink in the galaxy..."
output: "don't read"

a = "subject : important project, alejandro we refer to you  this ...."
output: "read"
 */
