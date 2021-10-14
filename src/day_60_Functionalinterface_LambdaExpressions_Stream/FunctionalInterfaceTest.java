package day_60_Functionalinterface_LambdaExpressions_Stream;

public class FunctionalInterfaceTest {

    public static void main(String[] args) {


        //create a function that can merge two string
        StringsFunction mergeTwoStrings = (s1, s2) -> {
            return s1 + s2;
        };

        String word1 = "Wooden";
        String word2 = "Spoon";

        String result1 = mergeTwoStrings.function(word1, word2);
        System.out.println("result1 = " + result1);

        System.out.println("/n*****************************************************");


        //create a function that can return the longest string between 2 strings
        StringsFunction longestString = (s1, s2) -> {
            if (s1.length() > s2.length()) {
                return s1;
            } else {
                return s2;
            }

        };
        String result2 = longestString.function("Cybertek", "Cydeo");
        System.out.println("result2 = " + result2);

        System.out.println("/n*****************************************************");

        //create a function that can return the initials of a person. ex Wooden Spoon ==> W.S
        StringsFunction initials = (f,s) -> {return f.charAt(0)+"."+s.charAt(0);};

        //longestString.function("Cybertek","School");
        String result3 = initials.function("Cybertek","School");
        System.out.println("result3 = " + result3);


        System.out.println("/n*****************************************************");

        DataFunction<String> reverseString = (str) ->
                //one and shor way by using StringBuilder reverse method than conver result to String type
                new StringBuilder(str).reverse().toString();
        String r1 = reverseString.accept("Wooden Spoon");
        System.out.println("r1 = " + r1);
//One way
//        {
//            String reverse = "";
//            for (int i = str.length()-1; i >=0 ; i--) {
//                reverse += str.charAt(i);
//
//            }
//            return reverse;
//        };

        System.out.println("/n*************************************************");
        //create a function that can return the first three characters of the string
        DataFunction<String> firstThreeChars = str -> str.substring(0,3);

        String r2 = firstThreeChars.accept("Wooden Sppon");
        System.out.println("r2 = " + r2);

        //create a function that can return the cube of an integer
        DataFunction<Integer> cube = n -> n*n*n;

        int num =cube.accept(10);
        System.out.println("num = " + num);
    }


}
