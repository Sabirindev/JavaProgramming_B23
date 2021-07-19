package operatorsAndDataTypes;

import java.util.Scanner;

public class DataTypesPracticeCasting {
    public static void main(String[] args) {
        byte b = 10;
        short s = 15;
        int i = 1000;
        long l = 2666555444l; //we should use 'l' at the end of long value, othervise JVM counts it as integer value.

        float f = 25.5f; // we should use 'f' at the end of float value, othervise JVM counts it as double value.
        double d = 36.6;

        char ch = 'A';

        boolean isboolean = true;

        System.out.print(b+","+s+","+i+","+l+","+f+","+d+","+ch+","+isboolean+"\n");

        double d2 = 10;
        float f2 = 25;

        int i2 = (int)100.5;
        long l2 = (long) 2666555444.5;

        double d3 = f2;

        System.out.println("double d2 = 10; ==>"+ d2);
        System.out.println("float f2 = 25; ==>"+ f2);
        System.out.println("int i2 = (int)100.5; ==>"+ i2);
        System.out.println("long l2 = (long) 2666555444.5; ==>"+ l2);
        System.out.println("double d3 = f2; ==> "+d3);

        System.out.println("****************************************************************");
        long l3 = 30; // 30 is counted as int value, but data type is still long
        // int i3 = l3; // it is compiler error, bc l3 data type is still long, however value is counted integer
        System.out.println("long l3 = 30 ==>"+l3);
        System.out.println("****************************************************************");
        long l4 = 30L;
        long l5 = (short)l4;
        System.out.println("long l4 = 30L;\nlong l5 = l4; ==> "+l5);
        System.out.println("****************************************************************");
        float    f3   =  100.987_6543f;
        System.out.println("float f3   =  100.987_6543f; ==> "+f3);
        float    f4   =  100.9876543f;
        System.out.println("float f4   =  100.9876543f; ==> "+f4);
        short s2 = (byte)f3;
        byte b2 = (byte)s2;
        System.out.println("short s2 = (byte)f3;\nbyte b2 = (byte)s2; ==> "+b2);
        System.out.println("****************************************************************");
        int i3 = 3 , b3 = 2;
        long c = (i3+b3) * 2 / 3 % 2 ;
        System.out.println("int i3 = 3  b2 = 2;\nlong c = (i3+b2) * 2 / 3 % 2 ;==> "+c);

        double d4 = (i3+b3) * 2 / 3 % 2 ;
        System.out.println("int i3 = 3  b2 = 2;\ndouble d4 = (i3+b2) * 2 / 3 % 2 ;==> "+d4);
        System.out.println("****************************************************************");
        double d5 = 3_000;
        System.out.println("double d5 = 3_000;\nd5%1000==> "+d5%1000);
        int i4 = (short)d5;
        System.out.println("int i4 = (short)d5;\ni4%1000 ==> "+ i4%1000);
        System.out.println("****************************************************************");

        int num = -5;
        System.out.print(num ++ +",");
        System.out.print(num = 6);
        System.out.print(","+ --num);
        System.out.println();

        System.out.println("****************************************************************");

        String name = "Jimmy";
        System.out.println(name);
        //name = "Ramiz";
        System.out.println(name = "Sabir");

    }
}
