package day15_String_Method;



public class StringMethods {
    public static void main(String[] args) {

        //***********************  charAt(index number)  *******************************
        System.out.println("********String charAt() method *******");
        String str = "Muhtar";
        char ch = str.charAt(0);

        System.out.println("ch = "+ch);

        String word = "Cybertek School";
                     //0123456789....

        char ch2 = word.charAt(9); //S
        System.out.println("ch2 = "+ch2);

        char ch3 = word.charAt(2); // y
        System.out.println("ch3 = "+ch3);

        //***********************  length()  *******************************
        System.out.println("*****String length() method******");

        String sentence = "Hello everyone, how are you all today?";

        int lengthOfSentence = sentence.length();
        System.out.println(lengthOfSentence);

        String s1 = "Cybertek";
        //index      01234567

        int lastIndex = s1.length() - 1;// in order to get the last index number we need to
                                        // subtract one from the length of String

        char firstCharacter = s1.charAt(0);
        char lastCharacter = s1.charAt(lastIndex);

        System.out.println("firstCharacter = "+firstCharacter);
        System.out.println("lastCharacter = "+ lastCharacter);

        //***********************  concat()  *******************************
        System.out.println("******String concat() method********");

        String firstName = "John";
        String lastName = "King";

        String fullName = firstName + " "  + lastName;
        String fullName2 = firstName.concat(" ").concat(lastName); // concat() method doing same (concatenation) as
                                                                  // as '+' does
        //System.out.println(fullName2);

        System.out.println(fullName);


        //**************toUpperCase()***********************
        System.out.println("************String toUpperCase() method***************");

        String s = "cybertek";
         s.toUpperCase(); // it is not gonna be make cybertek to CYBERTEK, because s varibale is immutable, we can not chage it value
        System.out.println("Old version = "+s);
        s = s.toUpperCase(); // now it will chnage becuase s variable is being assigned again then its old value(cybertek)
                            // stay at string pool memory, but it is get new value(CYBERTEK) by assigning (=)
        System.out.println("new version = " +s);

        //**************toLowerCase()***********************
        System.out.println("************String toLowerCase() method***************");
        String st1 = "SCHOOL";
        st1.toLowerCase();
        System.out.println("st1 old version = "+st1);

        st1 = st1.toLowerCase();
        System.out.println("st1 new version = "+st1);

        //******************trim()******************
        System.out.println("**************String trim() Method***********");

        String schoolNAme = "          Cybertek School          ";
        schoolNAme.trim();
        schoolNAme = schoolNAme.trim();
        System.out.println(schoolNAme);

    }
}
