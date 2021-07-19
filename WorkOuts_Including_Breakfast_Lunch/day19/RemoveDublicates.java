package day19;

import java.util.Scanner;

public class RemoveDublicates {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a word:");

        String word = scan.next(), result ="";

        if (word.length()== 5){
             for (int i = 0; i < word.length(); i++){
               if (!result.contains(""+word.charAt(i))){
                   result +=""+word.charAt(i);
               }
           }
        }else if (word.length() > 5){
            result = "Too long.";
        }else {
            result = "Too Short.";
        }
        System.out.println(result);
        scan.close();
    }
}
/*
1. ask the user to enter a word. the word must be five characters long
and print the word without the duplicated characters, but if the word is
less than five characters long, print "Too Short." and if the word is
more than five characters long, print "Too long."

        Ex:
            input:
                aabbc

             output:
                 abc
 */
