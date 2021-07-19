package day21;

public class RetrieveDigitsLettersSpecialCharFromString {
    public static void main(String[] args) {
        String str = "mn@#123Ab!";
        
        String letters = ""; // mnAb
        String digits = ""; //123
        String specialChars = ""; // @#!

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i); // gets each characters from the string

            if(each >= 'A' && each <= 'Z'){ //if the character is upper case letter
                letters += each;
            }else if(each >= 'a' && each <= 'z'){ // if the character is lower case letter
                letters += each;
            }else if(each>='0' && each <= '9'){ // if the character is digit
                digits += each;
            }else{ // if the character is special char
                specialChars += each;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }
}
/*
4. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */
