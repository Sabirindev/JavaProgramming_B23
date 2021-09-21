package III.Statements;

import java.util.Scanner;

public class WeekDays_SwitchStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number:");
        int intDay = scan.nextInt();
        String stringDay = "";

        switch (intDay) {
            case 1:
                stringDay = "Monday";
                break;
            case 2:
                stringDay = "Tuesday";
                break;
            case 3:
                stringDay = "Wednesday";
                break;
            case 4:
                stringDay = "Thursday";
                break;
            case 5:
                stringDay = "Friday";
                break;
            case 6:
                stringDay = "Saturday";
                break;
            case 7:
                stringDay = "Sunday";
                break;
            default:
                stringDay = "Not a valid day";
        }
        System.out.println(stringDay);
    }
}
/*
Write a program that will print a week days according to the day number. Use Switch statement.
 If an invalid day is entered print: "Not a valid day"

Example

Enter number:
1

Output: Monday
Enter number:
1

Output: Monday
Enter number:
7

Output: Sunday
 */
