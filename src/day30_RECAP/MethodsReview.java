package day30_RECAP;


import utilities.StringUtility;

public class MethodsReview {
    public static void main(String[] args) {
        String str = "Java";
        String result = StringUtility.reverse(str);
        System.out.println(result);

        String word = "Anna";
        System.out.println(StringUtility.isPalindrome(word));

    }
}
