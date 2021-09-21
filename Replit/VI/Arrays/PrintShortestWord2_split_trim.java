package VI.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintShortestWord2_split_trim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String shortestWords[] = str.split(",");
        String shortestWord = "";
        int count = 0;
//        System.out.println(Arrays.toString(shortestWords));
//        System.out.println("******* 2nd element length*******");
//        System.out.println(shortestWords[1].length());
//        System.out.println("************************************");


        int shortesLength = shortestWords[0].length();

        //finding shortest word in the string
        for (int i = 0; i < shortestWords.length; i++) {
            shortestWords[i] = shortestWords[i].trim();
            if (shortestWords[i].length() < shortesLength){
                shortesLength = shortestWords[i].length();

                //shortestWord = shortestWords[i];
            }
        }
        System.out.println(shortesLength);
        System.out.println("*******************************");

        //finding how many same size shortest in the string

        for (int i = 0; i < shortestWords.length; i++) {
            shortestWords[i] = shortestWords[i].trim();
            if (shortestWords[i].length()== shortesLength){
                shortestWord += shortestWords[i]+" ";
                count++;
            }
        }
      System.out.println(shortestWord);
        shortestWord = shortestWord.trim();
       // System.out.println(shortestWord);
        //System.out.println(count);
       // System.out.println("*********************************");
        String[] shortestWords2 = shortestWord.split(" ");
        //System.out.println(Arrays.toString(shortestWords2));
        Arrays.sort(shortestWords2);
        System.out.println(Arrays.toString(shortestWords2));
        scan.close();
    }
}
/*
Write a program that will find out shortest words in the given string str.
If there are few words that are evenly short, print them all.
Use split method in order to split str string variable and create an array of strings.
Print array with Arrays.toString() method. Sort array before printing.

 Hint: Split values by comma: split(", ");

 input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

output: [cat, old, ray]
 */
// aaaaaaa, sfsfdfdfdfd, dsffdfdfdf, angle, cccccccc, beech, hghghghghghgh, boost, olive