package VII.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class RM_int_getDuplicates {
    public static void main(String[] args) {
        //System.out.println("s1"=="s1");
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];

        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        System.out.println(getDup(strs));

    }
    //*****************************************************
    ///\/\/\/\/\/\/\/\/\/\/\/\/\\/\\/\/\\/\/\/\/\/\/\/\/\/\
    //*****************************************************

    public static int getDup(String r[]){
        int totalCount = 0;
        String stringDup = "";
        System.out.println("*************** remove duplicated ***********************");
        for (String each : r) {

            if (!stringDup.contains(each)){
                stringDup+=each+" ";
            }

        }
        stringDup.trim();
//        System.out.println(stringDup);
//        System.out.println(Arrays.toString(stringDup.split(" ")));

        System.out.println("*************** compare nondublicated array with  r arrays's elements ***********************");

        for (String each : stringDup.split(" ")) { // [1 2 aa]
            int count = 0;
            for (String element : r) {    //[1 2 aa 1 ]
                if (each.equals(element)){
                    count++;
                }
            }
            if (count > 1){
                totalCount+=count;
            }
        }


//        for (int i = 0; i < stringDup.length(); i++) {
//            int count = 0;
//            for (int j = 0; j < r.length; j++) {
//                if (stringDup.substring(i,i+1).equals(r[j]) ){
//
//                }
//            }
//        }



        return totalCount;
    }
}
/*
getDup accepts an array and returns an int.

If there is any element is duplicated, the method counts how many of those present in the array.

Example :

getDup(["1","2","aa"',"1"])
returns:2
("1" is duplicated and there are two "1"s so return is 2)

getDup(["1","2","aa"',"1", "aa"])
returns:4
("1" is duplicated and there are two "1"s and 2 "aa"s so return is 4)

getDup(["1","g","aabb',"7","7","2","aa"',"7"])
returns:3

hint:

you will need a nested array the will run on the array we get from the method argument.
inside the nested loop you will need to check if the main array element is equal to the current

 */
