package day17;

import java.util.Scanner;

public class AccountNumber_charAt_legth_If_Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your account number:");
        String accoutNumber = scan.next();

        char firstChar = accoutNumber.charAt(0);

        String result = "";

        //*****switch************
        switch (firstChar){
            case '2':  // the first character of account is 2
                if(accoutNumber.length() ==7){ //if length of account is  7
                    result = "Valid Account";
                }else{ //if length of account is not 7
                    result ="INVALID: it should be 7 characters long";
                }
                break;

            case '5': // the first character of account is 5
                if(accoutNumber.length() == 10){ // if length of account is  10
                    result = "Valid Account";
                }else{// if length of account is not 10
                    result = "INVALID: it should be 10 characters long";
                }
                break;

            default:
                result = "INVALID: first character need to be 2 or 5";
        }

        System.out.println(result);

         /* if Nested, If, else if, else
        if (accoutNumber.length() == 7 || accoutNumber.length() == 10){
            if (accoutNumber.charAt(0)== '2' && accoutNumber.length() == 7){
                System.out.println("Valid Account");
            }else if (accoutNumber.charAt(0) == '5' && accoutNumber.length() == 10){
                System.out.println("Valid Account");
            }else {
                System.out.println("Invalid Account");
            }
        }else {
            System.out.println("Invalid Accout");
        }*/
        scan.close();
    }
}
/*
1.Ask the user enter an account number (String). Check if these account number is valid.
    > If the account number begins with a “2” the account number should be 7 characters long
    > If the account number begins with a “5” the account number should be 10 characters long
    —> If the account number does not begin with a 2 or a 5 OR the account number lengths
    do not meet the expected results print “Invalid account number”
 */
