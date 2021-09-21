package III.Statements;

import java.util.Scanner;

public class Citizens_nextInt_method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String result = " ";
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int currentCountSenior = scan.nextInt(),
                currentCountNonSenior = scan.nextInt();

        System.out.println("What is new citizen's age?");
        int age = scan.nextInt();

        if (age > 0 && age < 135) {
            if (age >= 65) {
                currentCountSenior += 1;
                result = "Senior Citizen";
            } else {
                currentCountNonSenior += 1;
                result = "Non-Senior Citizen";
            }
        } else {
            System.out.println("Invalid age");
        }
        System.out.println(result + "\n" + "New seniorCitizens count " + currentCountSenior + "\n" +
                "New nonSeniorCitizens count " + currentCountNonSenior);
    }
}
/*
Declare int variables: seniorCitizens, nonSeniorCitizens, age
Create a Scanner object
Ask user to enter count for seniorCitizens and nonSeniorCitizens using message:

"Enter current count for seniorCitizens and nonSeniorCitizens:"

Ask user to enter age:

"What is new citizen's age?"

if citizen's age is more than or equals to 65 then print "Senior Citizen" and increment seniorCitizens variable by 1.

if citizen's age is less than 65 then print "Non-Senior Citizen" and increment nonSeniorCitizens variable by 1.

Last print another message:

"New seniorCitizens count ValueOfVariable"

"New nonSeniorCitizens count ValueOfVariable"

Example:

Enter current count for seniorCitizens and nonSeniorCitizens:
5
4
What is new citizen's age?
66
Senior Citizen
New seniorCitizens count 6
New nonSeniorCitizens count 4
 */
