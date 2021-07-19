package day07_ShortHand_Relational;

public class RelationalOperators {
    public static void main(String[] args) {

        // >, >=

        System.out.println(10 >11); // false
        System.out.println(10>=10); //true

        System.out.println(13 <= 14); // true
        System.out.println(13>= 14); //false

        System.out.println(5 ==6 ); // false
        System.out.println(5!= 6); //true

        System.out.println('a' == 'A'); // false
        System.out.println('a' !='A'); //true

        System.out.println("Java" == "java"); // false: not equal
        System.out.println("Java" != "java"); // true

        double abc = 10.0 / 3;
        System.out.println(abc);


    }
}
