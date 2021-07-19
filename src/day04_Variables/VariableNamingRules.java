package day04_Variables;

import java.security.spec.RSAOtherPrimeInfo;

public class VariableNamingRules {
    public static void main(String[] args) {
        int num = 100;
        //  double num = 200;  variable name MUST be unique

        String my_$name = "Muhtar";
        String school123_$ = "Cybertek";
        double salary$ = 20000;

        System.out.println(my_$name+"\n"+school123_$+"\n"+salary$);
        System.out.println("***********************************");

        int age = 35;
        String sentence = "My age is " +age;
        System.out.println(sentence);

        System.out.println("12"+1);
        System.out.println(12+1);
    }
}
