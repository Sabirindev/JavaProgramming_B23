package II.Variable;

import java.util.Scanner;

public class SchoolGrades_next_nextDouble_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfSubject = 0;
        String Summary;
        double score1, score2, score3, score4, score5, totalScore, averageGrade;

        System.out.println("Welcome to the Grader!" + "\n"
                + "Please enter subject name number 1 and score for this subject");
        String subject1 = scan.next();
        score1 = scan.nextDouble();
        numberOfSubject += 1;

        System.out.println("Please enter subject name number 2 and score for this subject");
        String subject2 = scan.next();
        score2 = scan.nextDouble();
        numberOfSubject += 1;


        System.out.println("Please enter subject name number 3 and score for this subject");
        String subject3 = scan.next();
        score3 = scan.nextDouble();
        numberOfSubject += 1;

        System.out.println("Please enter subject name number 4 and score for this subject");
        String subject4 = scan.next();
        score4 = scan.nextDouble();
        numberOfSubject += 1;

        System.out.println("Please enter subject name number 5 and score for this subject");
        String subject5 = scan.next();
        score5 = scan.nextDouble();
        numberOfSubject += 1;

        totalScore = score1 + score2 + score3 + score4 + score5;
        averageGrade = totalScore / numberOfSubject;

        Summary = "Summary: " + subject1 + " - " + score1 + ", " + subject2 + " - " + score2 + ", " +
                subject3 + " - " + score3 + ", " + subject4 + " - " + score4 + ", " + subject5 + " - " + score5 + "\n" +
                "Your average score is: " + averageGrade + "\n" + "Thank you for using Grader!" + "\n" +
                "Goodbye!";

        System.out.println(Summary);
    }
}
/*
Write the program that will calculate the average grade. Use 5 String variables and 6 double variables
to hold the subject and the grade value. Build a summary with all the information
by concatenating the subjects and grades. Then calculate the average grade and print display the average score too.

Execution flow with example:

Welcome to the Grader!
Please enter subject name number 1 and score for this subject
Math
5.0
Please enter subject name number 2 and score for this subject
Biology
4.2
Please enter subject name number 3 and score for this subject
English
4.4
Please enter subject name number 4 and score for this subject
Chemistry
4.8
Please enter subject name number 5 and score for this subject
Music
3.4

Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8, Music - 3.4
Your average score is: 4.36
Thank you for using Grader!
Goodbye!
 */
