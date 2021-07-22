package day34_LocalDateTime_Wrapper;

public class WrapperClassIntro {
    public static void main(String[] args) {
        short s = 10;
        int num = s;
        System.out.println(num);

        Integer num2 = num; // Autoboxing: converting primitive value to wrapper class value
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
        byte c1 = 10;

        Byte c2=c1;//Autoboxing
        //Short c3 = c1; // ****************wrapper class only accepts it's own primitive***************
        //Integer c4 = c1;
        //Long c5 = c1;
        //Float c6 = c1;
        //Double c7 = c1;



    }
}
