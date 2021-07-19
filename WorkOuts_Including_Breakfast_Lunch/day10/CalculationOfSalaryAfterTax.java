package day10;

import java.util.Scanner;

public class CalculationOfSalaryAfterTax {
    /*
    Write a program that can calculate the salary after tax based on the following requirements.
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition,if the person is married, he/she will pay 5% less tax,
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Salary: ");

        double salaryBeforeTax = scan.nextDouble(),
                taxRate = 0;
        boolean isMArried = true;


        if (salaryBeforeTax >= 130000) {
            taxRate = 0.35;
        }else if (salaryBeforeTax>=100000){
            taxRate = 0.30;
        }else if (salaryBeforeTax >=80000){
            taxRate=0.25;
        }else {
            taxRate = 0.20;
        }

        if (isMArried){
            taxRate-=0.05;
        }
        double salaryAfterTax = salaryBeforeTax-(salaryBeforeTax*taxRate);

        System.out.println(salaryAfterTax);
    }
}
