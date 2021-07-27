package day36;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyOddNumsByTwo_In_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2 != 0){
                list.set(i,list.get(i)*2);
            }
        }
        System.out.println(list);

        System.out.println(list);


    }
}
/*
 2. write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]
 */
