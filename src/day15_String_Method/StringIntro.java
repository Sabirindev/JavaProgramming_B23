package day15_String_Method;

public final class StringIntro {
    public static void main(String[] args) {

        String str1 = "Cybertek"; // Literal >>string pool memory
        String str2 = "Cybertek"; // Literal >> String pool memory >> Cybertek
        String str3 = "Cybertek";  // S.pool = Cybertek
        String str4 = "Cybertek"; //ctrl+ clickin on it
        String str5 = "Cybertek";
        String str6 = "Cybertek";

        System.out.println("str3 = " + str3);
        System.out.println("str6 = " + str6);

        str6 = "Bell Language school";

        System.out.println("str6 = " + str6);
        System.out.println("str3 = " + str3);


//        String str3 = new String("Cybertek");// new keyword >>> heap (out of string pool)
//        String str4 = new String("Cybertek");//


//        System.out.println("**************Sting Literal************************");
//
//        String s1 = "Cat";
//        String s2 = "Cat";
//        String s3 = "Cat";
//
//        System.out.println(s1==s2);// it is gonna be 'true'..because all object created (s1,s2,s3) got the same value
//                            // ans they are in string pool
//
//        System.out.println("**************String with New keyword************************");
//
//        String s4 = new String("Sabir");
//        String s5 = new String("Sabir");
//        String s6 = new String("Sabir");
//        String s7 = s4;
//
//        System.out.println(s4==s5); //false
//        System.out.println(s5==s6);//false
//
//        System.out.println(s7 == s4); // true




    }
}


