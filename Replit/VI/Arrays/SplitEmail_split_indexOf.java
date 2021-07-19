package VI.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SplitEmail_split_indexOf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        String emailID ="", emailDomain ="";
        boolean isMoreThenOne = email.indexOf("@") != email.lastIndexOf("@");

        if (!(email.contains("@")) || isMoreThenOne){
            System.out.println("invalid email");
        }else {
            String emailArr[] = email.split("@");
            System.out.println(Arrays.toString(emailArr));
            emailID = emailArr[0];
            emailDomain = emailArr[1];
        }
        System.out.println("Email id: "+emailID+"\nEmail domain: "+emailDomain);
        input.close();
    }
}
/*
Given a String variable email, write code using split method
to print email id and domain in separate lines.

Example:

email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com

If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com
Output:
invalid email

email -> my@fancy@email.com
Output:
invalid email
 */
