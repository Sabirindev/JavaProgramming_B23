package day06_UnaryOperators;

import java.text.DecimalFormat;

public class PrimitiveCasting {
    public static void main(String[] args) {

        byte a = 10;
        long b = a; // this is Implicit CASTING. it happens automatically

        System.out.println("*******************EXPLICIT CASTING******************");
        double d = 10.0;
        int e = (int)(long) d; //Explicit Casting
        System.out.println(d);
        System.out.println(e);

        long n = 100;
        int m = (int)n;

        float q = 2.5f;
        int u = (int)q;



        long r = (long)q;

        short s = (short)q;

        System.out.println((double) 2.5f);
        System.out.println((double) 10L);

        int w = 129;
        byte z = (byte)w;
        System.out.println("z= "+z);// WRONG RESULT because byte range is between -128 to 127

        int h = 70000;
        short g = (short) h;
        System.out.println("g= "+g);

        System.out.println("------------------------------------");

        double num1 = 1000.0;
        int num2 = (int) num1;

        System.out.println("num2(integer) = "+num2); //1000
        System.out.println("num1= "+num1);//1000.0

        System.out.println((int)100.23456); // 100

        System.out.println("******Important************");
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(1.5678912345));


    }
}
