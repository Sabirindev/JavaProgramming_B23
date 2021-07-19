package III.Statements;

import java.util.Scanner;

public class TipCalculator_Nested_if_for_Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalTip = 0,
                totalToPay = 0,
                totalPerPerson = 0,
                tipPerPerson = 0;
        System.out.println("Split:");
        String yesOrNo = scan.nextLine();


        System.out.println("Number of people:");
        int numberOfPeople = scan.nextInt();
        System.out.println("Check amount:");
        double checkAmount = scan.nextDouble();
        System.out.println("Service Quality:");
        String serviceQuality = scan.next();
        if (serviceQuality.equals("Poor")) {
            totalTip = checkAmount * 0.05;
        } else if (serviceQuality.equals("Fair")) {
            totalTip = checkAmount * 0.1;
        } else if (serviceQuality.equals("Good")) {
            totalTip = checkAmount * 0.15;
        } else if (serviceQuality.equals("Great")) {
            totalTip = checkAmount * 0.2;
        } else if (serviceQuality.equals("Excellent")) {
            totalTip = checkAmount * 0.25;
        } else {
            System.out.println("Invalid");
        }

        //double Poor = 0.05, Fair = 0.1, Good = 0.15, Great = 0.2, Excellent = 0.25;
        totalToPay = checkAmount + totalTip;
        totalPerPerson = totalToPay / numberOfPeople;
        tipPerPerson = totalTip / numberOfPeople;
        String signPerPerson = "";
        for (int i = 0; i < numberOfPeople; i++) {
            signPerPerson += "&";

        }
        if (yesOrNo.equalsIgnoreCase("Yes")) {
            System.out.println("Number of people entered: " + signPerPerson);
            System.out.println("Total to pay: " + totalToPay);
            System.out.println("Total tip: " + totalTip);
            System.out.println("Total per person: " + totalPerPerson);
            System.out.println("Tip per person: " + tipPerPerson);
        } else if (yesOrNo.equalsIgnoreCase("No")) {
            System.out.println("Number of people entered: " + signPerPerson);
            System.out.println("Total to pay: " + totalToPay);
            System.out.println("Total tip: " + totalTip);
            System.out.println("Total per person: " + (totalPerPerson = 0.0));
            System.out.println("Tip per person: " + (tipPerPerson = 0.0));
        }
        scan.close();
    }
}
/*
Write a program for a tip calculator. There will be different service quality benchmarks
that will determine the tip given. There will also the ability to calculate based on
the number of people in the party and if there is a split of the bill or not.

Poor = 5% Fair = 10% Good = 15% Great = 20% Excellent = 25%

The program should display the following information based on the user input:

Split or No split (Yes or No) Number of people entered: (number) (each person = & in output) Check amount:
(number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

Example

Input:
Yes
4
476.0
Excellent

Output:
Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
 */
