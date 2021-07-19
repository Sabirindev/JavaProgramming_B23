package day09_IfStatements;

public class PassOrFailed {
    public static void main(String[] args) {
        int score = 50;


        System.out.println("-------------------Onye by using iF Statements--------------------");
        if (score >= 60) {
            System.out.println("passed");
        }
        if (score < 60) {
            System.out.println("Failed");
        }
        System.out.println("-----------------by using If and Else statements---------------------");
        if (score >= 60) {
            System.out.println("Passed");
        } else System.out.println("Failed");
    }
}
