package day24_Arrays_Continue;

import java.util.Arrays;

public class StringMethodsRelatedToARRAYS {
    public static void main(String[] args) {
        System.out.println("********* split() Method ****************");
        String sentence = "I love learning java programming language";

        String[] words = sentence.split(" ");// creating (string) words array
        System.out.println(sentence); // print out string
        System.out.println(Arrays.toString(words)); // print out array

        System.out.println("************************************************");

        System.out.println("String sentence's length() = "+ sentence.length());
        System.out.println("array words[] legth = "+words.length);
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]+"<>");
        }

        System.out.println("\n************************************************");

        String email = "Cybertek@gmail.com";
        String[] emailArray = email.split("@");      //[Cybertek, gmail.com]
        System.out.println(Arrays.toString(emailArray));   //[Cybertek, gmail.com]
        String firstName = emailArray[0]; //Cybertek    //index    0         1
        System.out.println("First Name = "+ firstName);

        System.out.println("*****************toCharArray  Method*****************");
        String str = "ABCDE!@#$!";
        System.out.println(str+" ==> length of string str = "+ str.length());
        char[] characters = str.toCharArray();
        System.out.println( Arrays.toString(characters));
        System.out.println("length of array characters = "+characters.length);



    }
}
