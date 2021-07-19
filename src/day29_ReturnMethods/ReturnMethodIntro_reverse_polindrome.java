package day29_ReturnMethods;

public class ReturnMethodIntro_reverse_polindrome {
    public static void main(String[] args) {
        String str1 = "Cybertek",
        reversed = reverse(str1);
        System.out.println(str1);
        System.out.println(reversed);
        //String str2 = "level";
        isPolindrome(str1);
    }

    public static String reverse(String str){ //"ABC"
        String result = ""; //CBA

        for (int i = 0; i < str.length(); i++) {
            result += str.charAt((str.length()-1)-i); //reversing string
        }
        //System.out.println(result);
        return result;
    }

    public static void isPolindrome(String aaa){
        String reversedStr = reverse(aaa);

        //if (reversedStr.endsWith(aaa)){   // one way is for checking the word is polindrome or not
            if (reversedStr.equalsIgnoreCase(aaa)){  //second way is for checking the word is polindrome or not
            System.out.println(aaa+" is polindrome");
        }else{
            System.out.println(aaa+" is not polindrome");
        }

    }
}
