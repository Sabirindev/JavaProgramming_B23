package Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_ArrayList_Practice {
    public static void main(String[] args) {
        String cities[] = {"Boston","Houston","Austin","Lincoln","Tulsa"};
                                                                       // 0         1          2        3        4
        ArrayList<String> list = new ArrayList(Arrays.asList(cities)); //Boston","Houston","Austin","Lincoln","Tulsa

        int a = list.size(); // 5

        System.out.println(a);
        System.out.println(" /n*************************************** ");
        System.out.println(list);


                    //notsuoH
                    //0123456
        for (String citName : list) {//"Boston","Houston","nitsuA","notsuoH","notsoB"
                                // 0,1,2,3,4

            String rev = "";

                                             // i: 6
            for (int i = citName.length()-1; i >= 0 ; i--) {

                rev += citName.charAt(i);  //    Houston.charAt(6) >>> Houston

            }

            //rev = notsuoH
            //"Boston","Houston","Austin","Lincoln","Tulsa"
            //    0        1        2         3         4
            //"Boston","Houston","nitsuA","notsuoH","notsoB"


            //a = 5
            //a : 4

            list.set(--a,rev); //a:4, 3 , 2,  == list.set(1,"Houston");

//            System.out.println("****************fff****************");
//            System.out.println(list);
        }




        System.out.println(list);
    }
}
