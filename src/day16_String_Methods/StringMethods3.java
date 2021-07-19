package day16_String_Methods;

public class StringMethods3 {
    public static void main(String[] args) {

        //****replace()*******************
        String email = "Cybertek@yahoo.com";
        System.out.println(email);
        email = email.replace("yahoo","gmail");
        System.out.println(email);

        System.out.println("************replace()******************");

        String sentence = "C# is cool, C# is fun";
        System.out.println(sentence);
        sentence = sentence.replace("C#","Java");
        System.out.println(sentence);

        System.out.println("***********replaceFirst()**************");

        //********replaceFirst()********
        String sentence1 = "C# is cool, C# is fun";
        System.out.println(sentence1);
        sentence1 = sentence1.replaceFirst("C#","Java");
        System.out.println(sentence1);

        System.out.println("**********replaceFirst()*************");
        String s = "Cat Dog Cat Dog Cat";
        s= s.replaceFirst("Cat", "Dog");
        System.out.println(s);

        System.out.println("*************indexOf()*************");
        //**************indexOf()********

        String sentece2 = "Java is a cool language";
        int indexOfFirstA = sentece2.indexOf('a');
        int indexOfSecondA = sentece2.indexOf("a ");
        int indexOfThirdA = sentece2.indexOf("a c");
        int indexOfFourthA = sentece2.indexOf("an");
        int indexOfFifthA = sentece2.indexOf("ag");

        System.out.println("indexOfFirstA = "+indexOfFirstA);
        System.out.println("indexOfSecondA = "+indexOfSecondA);
        System.out.println("indexOfThirdA = "+indexOfThirdA);
        System.out.println("indexOfFouthA = "+indexOfFourthA);
        System.out.println("indexOfFifthA = "+indexOfFifthA);

        //**************isEmpty()******************
        System.out.println("**************isEmpty()******************");
        String s2 ="          "; // this is not Empty because there space button is clicking
        s2 = s2.trim();//"" // now it is empty by using trim() method
        boolean r1 = s2.isEmpty();
        System.out.println("r1 = "+r1); // true

        //***************equals()**************
        System.out.println("**************equals()**************");

        String str1 = "Cat"; //string pool memory
        String str2 = new String("Cat");// Java Heap memory
        String str3 = new String("Cat");//Java Heap memory

        System.out.println(" ==>> " + (str1 == str2)); //false
        System.out.println("equal()>> "+str1.equals(str2));//true

        System.out.println( str2 == str3 ); // false
        System.out.println( str2.equals(str3) ); //true

        System.out.println("--------------------------------");
        String word1 = "Java";
        String word2 = "java";

        System.out.println(word1 == word2);// false: two different object
        System.out.println( word1.equals(word2) ); // false: case sensitivity

        System.out.println( word1.equalsIgnoreCase(word2) );

        /*
        difference between == and equals() method
         */








    }
}
