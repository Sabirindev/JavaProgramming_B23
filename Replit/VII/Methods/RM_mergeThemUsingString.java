package VII.Methods;

import java.util.Scanner;

public class RM_mergeThemUsingString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }
    public static String mergeStrings(String one, String two) {
        String result = "";
        int oneSize = one.length(),
                twoSize = two.length();
        if (one.length() >= two.length()) {
            for (int i = 0; i < one.length(); i++) {
                result += one.substring(i, i + 1);
                twoSize--;
                if (twoSize >= 0) {
                    result += two.substring(i, i + 1);
                }
            }
        } else if (one.length() < two.length()) {
            for (int i = 0; i < two.length(); i++) {
                oneSize--;
                if (oneSize >= 0) {
                    result += one.substring(i, i + 1);
                }
                result += two.substring(i, i + 1);
            }
        }
        return result;
    }

}
/*
Write a method mergeStrings that will return the strings merged,
one letter at a time, starting with one. Please note one and two can be of different lengths.

Examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"

mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"
 */
