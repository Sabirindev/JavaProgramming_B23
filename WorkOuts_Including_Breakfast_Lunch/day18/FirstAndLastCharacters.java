package day18;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class FirstAndLastCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word:");
        String word1 = scan.next();
        System.out.println("Enter second word:");
        String word2 = scan.next();
        String wordsMerging = "";

        boolean isFirstAndLastCharSame = word1.substring(word1.length() - 1).equalsIgnoreCase(word2.substring(0, 1));

        if (isFirstAndLastCharSame) {
            wordsMerging = word1 + word2.substring(1);
        } else {
            wordsMerging = word1 + "\'s last char is not same with " +
                    word2 + "\'s first char: " + word1 + word2;
        }
        System.out.println(wordsMerging);
        /*
        //*****Second way for solution******
      if( word1.toLowerCase().endsWith( word2.substring(0,1).toLowerCase() )   ){
            //""+word2.charAt(0):   ""+'e' ==> "e"
            System.out.println(word1 +  word2.substring(1));
        }else{
            System.out.println(word1+word2);
        }

         */
        scan.close();
    }

}
/*
2. Ask user to enter two words. Then add them together and print.
But if the last letter if the first word and the first letter of the last letter is the same,
 print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight
 */
