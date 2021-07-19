package day15_String_Method;

public class SubStringPractice {
    public static void main(String[] args) {

        String sentence = "My favorite TV series is The Walking Dead";

        String tvSeries = sentence.substring(25);

        System.out.println(tvSeries);

        String senctence2 = "Java is a fun Language";
        //index              0123456789

        String s1 = senctence2.substring(10,12+1);
        System.out.println(s1);

        String s2 = senctence2.substring(14);
        System.out.println(s2);
    }
}
