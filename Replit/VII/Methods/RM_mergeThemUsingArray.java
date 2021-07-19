package VII.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class RM_mergeThemUsingArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }

    public static String mergeStrings(String one, String two) {
        String result = "";
        char ch1[] = one.toCharArray();
        char ch2[] = two.toCharArray();
        String str[] = new String[ch1.length + ch2.length];
        int oneSize = ch1.length,
                twoSize = ch2.length;
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        if (ch1.length >= ch2.length) {
            for (int i = 0, j = 0; i < ch1.length; i++) {
                str[j] = "" + ch1[i];
                j++;
                twoSize--;
                if (twoSize >= 0) {
                    str[j] = "" + ch2[i];
                }
                j++;
            }
        } else if (ch1.length < ch2.length) {
            for (int i = 0, j = 0; i < ch2.length; i++) {
                oneSize--;
                if (oneSize >= 0) {
                    str[j] = "" + ch1[i];
                }
                j++;
                str[j] = "" + ch2[i];
                j++;
            }
        }
        for (int i = 0; i < str.length; i++) {
            result += str[i];
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
