package IV.String;

import java.util.Scanner;

public class AlejandroI_contains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        String result = "";
        if (sentence.contains("alejandro")){
            result = "read";
        }else {
            result = "don't read";
        }
        System.out.println(result);
        scan.close();
    }
}
/*
Alejandro has many emails and only has time to read the emails that refer to him.
Check if his name is found in the email and if it does print "read",
but if his name is not in the email print "don't read"

Examples:

a = "dear alejandro.....alot of text"

output: "read"
a = "dear alejandro.....alot of text"

output: "read"
a = "thunder blaz is the best drink in the galaxy..."

output: "don't read"
a = "thunder blaz is the best drink in the galaxy..."

output: "don't read"
a = "subject : important project, alejandro we refer to you  this ...."

output: "read"
 */
