package III.Statements;

import java.util.Scanner;

public class ConditionalStatementPractice3_If_Else {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine(),
                result = "";

        if (name.equalsIgnoreCase("Chen")){
            result = "teacher";
        }else {
            result = "student";
        }
        System.out.println(result);
    }
}
/*
    The variable name holds a String user input

Write a conditional statement that will determine if the person is a student or teacher.

If name is equal to "Chen", print "teacher"
For any other input, print "student"
Examples:

input: Chen
output: teacher
input: Chen
output: teacher
input: Faa
output: student
 */
