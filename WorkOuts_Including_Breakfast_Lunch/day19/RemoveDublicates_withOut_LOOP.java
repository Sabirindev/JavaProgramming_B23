package day19;

import java.util.Scanner;

public class RemoveDublicates_withOut_LOOP {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a word:");

        String word = scan.next(), result ="";

        if (word.length()== 5){
//            for (int i = 0; i < word.length(); i++){
//                if (!result.contains(""+word.charAt(i))){
//                    result +=""+word.charAt(i);
//                }
//            }
            if (!result.contains(""+word.charAt(0))){
                result +=""+word.charAt(0);
            }if (!result.contains(""+word.charAt(1))){
                result +=""+word.charAt(1);
            }if (!result.contains(""+word.charAt(2))){
                result +=""+word.charAt(2);
            }if (!result.contains(""+word.charAt(3))){
                result +=""+word.charAt(3);
            }if (!result.contains(""+word.charAt(4))){
                result +=""+word.charAt(4);
            }
        }else if (word.length() > 5){
            result = "Too long.";
        }else {
            result = "Too Short.";
        }
        System.out.println(result);
        scan.close();
    }
}
