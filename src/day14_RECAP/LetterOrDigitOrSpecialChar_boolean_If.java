package day14_RECAP;

public class LetterOrDigitOrSpecialChar_boolean_If {
    public static void main(String[] args) {

        char ch = '?';
        boolean isDigit = ch >= '0' && ch <= '9';

        boolean isLetter =  ( ch >= 'A' && ch <= 'Z')  ||  (ch >='a' && ch <= 'z') ;
        // if the character is upper case letter or lower case letter

        // boolean isSpecialCharacter = !isDigit && !isLetter;
        /*
        String result = "";
        if(isDigit){
            result =  ch+ " is digit";
        }else if (isLetter){
            result = ch+ " is letter";
        }else{
            result = ch+" is special character";
        }
         */

        String result =  (isDigit) ?  ch+ " is digit" :(isLetter)? ch+ " is letter" : ch+" is special character";

        System.out.println( result);
    }
}
