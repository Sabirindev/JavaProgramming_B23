package VII.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class RM_boolean_Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));
    }
    public static boolean isAnagram(String word1, String word2){
        char ch1[]= word1.toLowerCase().toCharArray(),
                ch2[]= word2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1,ch2)){
            return true;
        }
        return false;
    }
}
/*
Anagram is a word, phrase, or name formed by rearranging the letters of another,
such as cinema, formed from iceman.

The isAnagram method checks if word1 and word2 are anagram to each other then return a boolean.

each letter in word1 should appear in word2 exact number of times
ignore empty spaces
make your code case insensitive

Examples:
isAnagram("listen", "Silent") ==> true
isAnagram("star", "rats") ==> true
isAnagram("earth", "heart") ==> true
isAnagram("hi", "bye") ==> false
isAnagram("java", "cava") ==> false

 */
