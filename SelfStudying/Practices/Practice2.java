package Practices;

public class Practice2 {
    public static void main(String[] args) {
        char ch = 'A';

        String s1 = "book"; //                          string pool "book"
        String s2 = "book";
        String s3 = "book";
        String s4 = "book";
        String str1 = new String("book");

        System.out.println(s1 == s2); // true
        System.out.println(s1 == str1); //false
        System.out.println(s1.equals(str1));// true

        //String str1 = new String("pen"); // by new keyword out of S.pool
        String str2 = new String("pen");
        String str3 = new String("pen");




//        if(str.contains("goes")){
//            System.out.println(true);
//        }
//        else{
//            System.out.println(false);
//        }


    }
}
