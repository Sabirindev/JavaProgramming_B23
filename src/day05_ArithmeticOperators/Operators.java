package day05_ArithmeticOperators;

public class Operators {
    public static void main(String[] args) {
        int a = 10;
        // (whole)integer number is divided by decimal number. result is Decimal
        System.out.println(a / 4.0 +" is Decimal");

        //integer num is divided by integer. result is INTEGER
        System.out.println(a / 4 +" is Integer");

        int b = 100 /3;
        System.out.println(b); // 33

        double d  = 100.0 / 3;
        System.out.println("d = "+d); // 33.333333..36

        double x = 100/3.0;
        System.out.println("x = "+x); // 33.3333....36


    }
    /*
    OutPut:

    2.5 is Decimal
    2 is Integer
     */
}
