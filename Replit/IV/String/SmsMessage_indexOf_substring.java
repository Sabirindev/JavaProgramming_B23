package IV.String;

import java.util.Scanner;

public class SmsMessage_indexOf_substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
//Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

        int indexOfAngleBracket1 = message.indexOf('<'),
                indexOfAngleBracket2 = message.indexOf('>'),
                indexOfSquareBracket1 = message.indexOf('['),
                indexOfSquareBracket2 = message.indexOf(']'),
                indexOfCurlyBracket1 = message.indexOf('{'),
                indexOfCurlyBracket2 = message.indexOf('}');


        String sender = message.substring(indexOfAngleBracket1+1,indexOfAngleBracket2);
        String phoneNumber = message.substring(indexOfSquareBracket1+1,indexOfSquareBracket2);
        String messageBody = message.substring(indexOfCurlyBracket1+1,indexOfCurlyBracket2);

        System.out.println("Sender: "+sender+"\nPhone Number: "+phoneNumber+"\nMessage body: "+messageBody);
        scan.close();
    }
}
/*
Given a String **message** in the following format:
` Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}`
assign the value of the **sender, phoneNumber, and messageBody** variables and print them.

```
Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving
 */
