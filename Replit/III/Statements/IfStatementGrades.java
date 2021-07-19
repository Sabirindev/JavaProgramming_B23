package III.Statements;

import java.util.Scanner;

public class IfStatementGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        String grade = "";

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                grade = "excellent";
            } else if (score >= 70) {
                grade = "good";
            } else if (score >= 60) {
                grade = "pass";
            } else {
                grade = "fail";
            }
        } else {
            grade = "invalid score";
        }
        System.out.println(grade);
    }
}
/*
Write a program that takes the grade int and prints if it's a passing grade or failure.

if grade is bigger than 90 output "excellent"
if the grade is bigger than 70 and smaller then 90 output "good"
if grade is bigger than 60 and smaller than 70 output "pass"
if grade is smaller than 60 output "fail"
Examples:

93

excellent
93

excellent
46

fail
46

fail
80

good
 */
