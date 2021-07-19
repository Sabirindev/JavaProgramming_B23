package utilities;

import java.util.Arrays;

public class StringUtility {
    //1.reverses any given string, and returns it as String
    public static String reverse(String str){ //ABC
        String reverseStr = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverseStr += str.charAt(i);
        }
        //System.out.println(reverseStr);
        return reverseStr;
    }


    // 2.checks if the given strig is palindrome, returns boolean
    // "level" == > isPalindrome ==> true
    public static boolean isPalindrome(String str){
        String reversedStr = reverse(str); // "avaJ"
        return str.equalsIgnoreCase(reversedStr);
    }


    //3.checks if the given string are Anagram
    // "heart" & "earth"  ==> isAnagram ==> true
    public static boolean isAnagram(String str1, String str2 ){
        char[] ch1 = str1.toCharArray(); //{'h','e','a','r','t'}
        char[] ch2 = str1.toCharArray(); //{'e','a','r','t','h'}

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }


    //4.create a method that can remove dublicates from string, returns String
    //removeDup("AAABBBBBBCCCCCCC") ===? "ABC";
    public static String removeDup(String str){ //"AABBBCC"
        String result = "";
        for (char ch : str.toCharArray()) {
            if (result.indexOf(ch)== - 1){//!result.contains(""+ch) is another way to find none dublicated character
                result += ch;
            }
        }
        return result;
    }



    //5.returns the frequency of ch from the string str
    public static int frequency(String str, char ch){
        int count = 0;

        for (char each : str.toCharArray()) { // each: represents each character of str
            if(each == ch){
                count++;
            }
        }

        return count;
    }


    //6.returns the unique characters from the string
    public static String uniqueChars(String s){
        String unique = "";

        for(int i = 0; i <= s.length()-1; i++){
            char each = s.charAt(i);
            int frequency =  frequency(s, each);
            if(frequency == 1){
                unique += each;
            }
        }

        return unique;
    }



    //7.returns the frequncy each each characters, returns string
    public static String frequencyOfChars(String str){
        String result = ""; //A3B2C4

        for (char each : removeDup(str).toCharArray()) { // each: A, B C
            int frequency =  frequency(str, each); // gets the frequency of each character: 3, 2, 4
            result += each ; //"ABC"
            result += frequency;//"A3B2C4"
        }

        return result;
    }


    //8. returns the frequency of the word from the sentence
    public static int frequencyOfWord(String sentence, String word){
        int count = 0;
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            count++;
        }
        return count;
    }


}
