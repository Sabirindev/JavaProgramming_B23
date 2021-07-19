package day17;

public class StringLiteral_NewKeyword {
    public static void main(String[] args) {
        System.out.println("********String pool--Literal********");
        //*****String pool******** in heap
        String s1 = "Java"; // String pool  // one "Java" created at string pool
        String s2 = "Java";// String pool      // is not allowed to double
        String s3 = "JAVA";// String pool   but Java != JAVA at string pool

        System.out.println(s1==s2); // true
        System.out.println(s1==s3); //false
        System.out.println(s1.equalsIgnoreCase("JAVA")); //true
        System.out.println(s1.equals("JAVA")); // false


        System.out.println("********Out of String pool--New Keyword********");
        //**********Out of String Pool in heap
        String s4 = new String("Java"); // out of S.pool in the heap
        String s5 = new String("Java"); // out of S.pool in the heap
        String s6 = new String("JAVA");

        System.out.println(s4 == s5); //false "new" keyword creates new object always
        System.out.println(s5 == s6); // false Java != JAVA also 2 diffrent object
        System.out.println(s4.equals("Java"));//true
        System.out.println(s5.equals(s6)); // false
        System.out.println(s5.equalsIgnoreCase(s6));

        System.out.println("*****literal and new keyword*******");

        System.out.println(""+s1.equals(s5));
           //      s1="Java" is from spring pool , s5="Java" from out of string pool

        String str1 = "Dog";
        String str2 = "Cat";
        str1 = str2; // we have chnaged value of str1 "from Dog to Cat"
        System.out.println(str1 == str2);//true

        String str3 = "Java";
        str3.replace("a","e");// still Java
        System.out.println(str3);//still Java
        str3 = str3.replace("a","e");
        System.out.println("** "+str3); //Jeve
        System.out.println(str3.replace("a","e"));// Jeve

        System.out.println("**********by String literal******");

        String word1 = "Welcome";
        String word2 = "Welcome";

        System.out.println(word2); //Welcome

        String word3 = word1.substring(0,1); //W
        System.out.println(word3); //W

        //*************Very Important******************

        String word4                        =     "Sabir";
        //word4 is reference variable          Sabir is object (instance)
        String word5 = "Cybertek";

        //word4 = "Sabir";
        word4.concat(word5); // concatenation is happend so >> SabirCybertek
                            //but word4 still gets same value "Sabir"
        System.out.println("word4 = "+word4); // Sabir  //without assigning the value to variable
                                                //its not gona change

        word4 = word4.concat(word5); //now wrod4's value is SabirCybertek because we  assigned it to reference varibale,
        System.out.println("word4 = "+word4); //SabirCybertek
                                            //now its value changed but it does not mean that the old value is removed
                                            //old value still in the string pool waiting for refernce or garbage collecter
        System.out.println(word4);
        String word6 = "Sabir";
        System.out.println("word4 = "+ word4);
        System.out.println("word6 = "+ word6);



    }
}
