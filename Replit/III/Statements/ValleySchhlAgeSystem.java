package III.Statements;

import java.util.Scanner;

public class ValleySchhlAgeSystem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = scan.nextInt();
        String category = "";

        if (age >= 2 && age <= 18) {

            if (age == 2) {
                category = "toddler";
            } else if (age <= 5) {
                category = "early childhood";
            } else if (age <= 7) {
                category = "young reader";
            } else if (age <= 10) {
                category = "elementary";
            } else if (age <= 12) {
                category = "middle";
            } else if (age <= 13) {
                category = "impossible";
            } else if (age <= 16) {
                category = "high school";
            } else {
                category = "scholar";
            }
        } else {
            category = "ineligible";
        }
        System.out.println(category);
    }
}
/*
 /*
    In the Happy Valley School System, children are classified by age as follows:

Assume only positive numbers are given

less than 2, ineligible
2, toddler
3-5, early childhood
6-7, young reader
8-10, elementary
11 and 12, middle
13, impossible
14-16, high school
17-18, scholar
greater than 18, ineligible
less than 2, ineligible
2, toddler
3-5, early childhood
6-7, young reader
8-10, elementary
11 and 12, middle
13, impossible
14-16, high school
17-18, scholar
greater than 18, ineligible
Given age print out the category the student would fall under

Example:

Enter age:
8

elementary
     */

