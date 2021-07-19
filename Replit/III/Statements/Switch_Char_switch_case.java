package III.Statements;

import java.util.Scanner;

public class Switch_Char_switch_case {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter command:");
        char ch = scan.next().charAt(0);

        String stringPrint = "";

        switch (ch){
            case 'y': stringPrint = "Your request is being processed";
                break;
            case 'n': stringPrint = "Thank you anyway for your consideration";
                break;
            case 'h': stringPrint = "Sorry, no help is currently available";
                break;
            default: stringPrint = "Invalid entry, please try again!";
        }
        System.out.println(stringPrint);
    }
}
/*
Write a switch statement that tests the value of the char variable response and performs the following actions:

if response is y, the message Your request is being processed is printed
if response is n, the message Thank you anyway for your consideration is printed
if response is h, the message Sorry, no help is currently available is printed
for any other value of response, the message "Invalid entry, please try again!" is printed
Example:

Display prompt: Enter command:
input: y
Display prompt: Your request is being processed
 */
