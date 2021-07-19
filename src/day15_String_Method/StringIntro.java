package day15_String_Method;

public class StringIntro {
    public static void main(String[] args) {

        String str1 = "Cybertek"; // Literal
        String str2 = new String("Cybertek");// new keyword

        System.out.println("**************Sting Literal************************");

        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = "Cat";

        System.out.println(s1==s2);// it is gonna be 'true'..because all object created (s1,s2,s3) got the same value
                            // ans they are in string pool

        System.out.println("**************String with New keyword************************");

        String s4 = new String("Sabir");
        String s5 = new String("Sabir");
        String s6 = new String("Sabir");
        String s7 = s4;

        System.out.println(s4==s5); //false
        System.out.println(s5==s6);//false

        System.out.println(s7 == s4); // true




    }
}
