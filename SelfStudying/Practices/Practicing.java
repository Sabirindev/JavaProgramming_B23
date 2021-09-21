package Practices;

import java.util.Arrays;

public class Practicing {
    public static void main(String[] args) {
//        byte[] b = new byte[5];
//        System.out.println(Arrays.toString(b));
//
//        for (int i = 0; i < b.length; i++) {
//            b[i]= (byte)(b[i]*2);
//        }
//        System.out.println((b)); // hashcode is printed bc we have to use toString

        System.out.println(17%2);

        Integer a = 25;
        String b = a.toString();
        System.out.println(b + 5);
        if (b.length()-1 == 0){
            System.out.println("number ends with zero");
        }else {
            System.out.println("number ends with 5");
        }

    }
}
