package day07;

public class PrePost {
    /*
     manually calculate the following code fragments:

          1. int a = 100;
             int b = -a++ + ++a - a-- * a-- % 2

     */
    public static void main(String[] args) {
        int a = 100;

        int b = -a++ + ++a - a-- * a-- % 2;

        /*
        - 100 + 102 - 102 *101 % 2 = >> -100 + 102 - 10302 % 2 =>> - 100 + 102 - 0 = 2
         */

        System.out.println(b);
    }
}
