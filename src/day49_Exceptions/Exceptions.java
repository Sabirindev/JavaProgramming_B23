package day49_Exceptions;

import java.io.FileInputStream;

public class Exceptions {
    public static void main(String[] args) {
//        int[] arr = {1,2,3};
//        System.out.println(arr[100]);// exception: arrayIndexOutOfBounds Exceptionn
//

        String str = null;
        System.out.println(str.toUpperCase());// exception: NullPointerException


        System.out.println("Hello");

        System.out.println("**************************************************");

        // 3000 millis == 3 sec


try {
    Thread.sleep(3000); // checked exception
}catch (InterruptedException e){
    e.printStackTrace();
}
        //FileInputStream file = new FileInputStream("");
    }
}
