package IV.String;

import java.util.Scanner;

public class Email2_substring_indexOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if (email.contains("_")) {
            int indexOfAt = email.indexOf('@'),
                    indexOfUnderScore = email.indexOf('_'),
                    indexOfDot = email.indexOf(".");

            String firstName = email.substring(0, indexOfUnderScore),
                    lastName = email.substring(indexOfUnderScore + 1, indexOfAt),
                    domain = email.substring(indexOfAt + 1, indexOfDot).toLowerCase();

            firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
            lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
            //domain = domain.substring(0,1).toUpperCase()+ domain.substring(1);

            System.out.println("First name: " + firstName + "\nLast name: " + lastName + "\nDomain: " + domain);
        }else {
            System.out.println(email);
        }
        scan.close();
    }
}
/*
Write a program that will print out information about user based on email.
 Print first name, last name, and domain.
 First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

Example:

```
Input: craig_federighi@apple.com

```
```
Output:
First name: Craig
Last name: Federighi
Domain: apple
 */
