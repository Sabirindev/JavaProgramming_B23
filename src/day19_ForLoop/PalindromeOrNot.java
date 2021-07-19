package day19_ForLoop;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        // polindrome means reverse of the word is same as the word is.
        // such as Level >>> reverse of Level is Level

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = scan.nextLine();

        String reverseName ="";

        for (int i = name.length()-1; i >= 0; i--) {
            reverseName += ""+ name.charAt(i);
        }
        boolean isPalindrome = name.equalsIgnoreCase(reverseName);

        if (isPalindrome){
            System.out.println(name+" is palindrome");
        }else{
            System.out.println(name+" is not palindrome");
        }
    }
}
