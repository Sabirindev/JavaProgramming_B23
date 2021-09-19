package day15_String_Method;

public class SubStringPractice {
    public static void main(String[] args) {

//        String sentence = "My favorite TV series is The Walking Dead";
//
//        String tvSeries = sentence.substring(25);
//
//        System.out.println(tvSeries);
//
//        String senctence2 = "Java is a fun Language";
//        //index              0123456789
//
//        String s1 = senctence2.substring(10,12+1);
//        System.out.println(s1);
//
//        String s2 = senctence2.substring(14);
//        System.out.println(s2);

        String sentence = " Cybertek School";

        System.out.println(sentence.contains("hoo"));

        System.out.println(sentence.isEmpty());//false

        String empty = "";
        System.out.println(empty.isEmpty());//true

        String s1  = "sababcbir";
        //index       01234567
        String s2 = "Sabir";

        System.out.println("s1.equals(s2) = " + s1.equals(s2));
        System.out.println("s1.equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase(s2));

        System.out.println("s1.indexOf(b) = " + s1.indexOf("b"));
        System.out.println("s1.lastIndexOf('b') = " + s1.lastIndexOf('b'));
        System.out.println("s1.indexOf('i') = " + s1.indexOf('i'));

        String a1= "Trump";

        System.out.println("a1.startsWith(\"t\") = " + a1.startsWith("t"));
        System.out.println("a1.startsWith(\"T\") = " + a1.startsWith("T"));

        System.out.println("a1.endsWith(\"P\") = " + a1.endsWith("P"));
        System.out.println("a1.endsWith(\"p\") = " + a1.endsWith("p"));

    }
}
