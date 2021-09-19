package day03_Variables;

public class Addition {
    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 200;
        System.out.println("num1 = "+num1);

        //int sum = num1 + num2;

        num1 = 200;

        int sum = num1 + num2;
        System.out.println("num1 = "+num1);

        //byte, short,int, long => whole number ==> 1, 2, 25,  35L  as default int
        //float,double => float number ==> 1.5, 2.6, 3.6f  as default double
        //char         ==> 'c', 'A' ==> /0000
        //boolean  ==> false/true  as default false

        long b= 10L;

        int a = (int)b;

        short s1 = 250;
        byte b1 = (byte)s1;  // -128 and +127

        System.out.println("b1 ="+ b1);

        System.out.println(sum);
    }
}
