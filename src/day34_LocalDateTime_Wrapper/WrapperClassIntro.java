package day34_LocalDateTime_Wrapper;

import java.util.ArrayList;

public class WrapperClassIntro {
    public static void main(String[] args) {
        short s = 10;//primitveb - none Object
        System.out.println("Primitve value = "+s);


        Short s1 = 20; // Wrapper class short - Object

        String str1 = s1.toString();// converted to String

        System.out.println("String value "+str1);

        str1= str1 + 5;//205
        str1 = 5 + 5 + str1;
        System.out.println(str1);//205 //5520 or 10205

        int[] array1 ={1,2,3};   //
        Integer[] array2 = {4,5,6};

        ArrayList<Integer> list = new ArrayList<>();

        int a =10;

        Integer b = 10;

        int sum = a +b;
        System.out.println(sum);





        int num = s; //primitive
        System.out.println(num);

        Integer num2 = num; // Autoboxing: assigning primitive value to wrapper class value
                            //Unboxing: assigning wrapper class value to primitive value

        Integer a1 =20;

        Integer a2 = a1;// assigning wrapper to wrapper - None boxing

        //int b1 = 10;

        //int b2 = b1; //assigning primtive to primitive - None boxing

        char ch = '@';
        Character ch2 = (Character) ch;// Autoboxing
        System.out.println(ch2);

        Byte b1 = 10;

        byte b2 = b1; //unboxing
        short b3 = b1;//unboxing
        int b4 = b1; //unboxing
        long b5 = b1;//unboxing
        float b6 = b1;//unboxing
        double b7 =  b1;//unboxing

        System.out.println("***************************************************");
        short c1 = 10;

//        Byte c2=c1;//Autoboxing
//        Short c3 = c1; // ****************wrapper class only accepts it's own primitive***************
//        Integer c4 = c1;
//        Long c5 = c1;
//        Float c6 = c1;
//        Double c7 = c1;



    }
}
