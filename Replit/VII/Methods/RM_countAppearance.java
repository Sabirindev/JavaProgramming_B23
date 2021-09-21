package VII.Methods;

import java.util.Scanner;

public class RM_countAppearance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String str[] = new String[size];
        for (int i = 0; i < size; i++) {
            str[i] = in.next();
        }
        String word = in.next();
        //int counting = countAppearance(str,word);
        System.out.println(countAppearance(str,word));
        in.close();
    }
    public static int  countAppearance(String arr[], String t){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (t.equals(arr[i])){
                count++;
            }
        }
        return count;
    }
}
/*
Create a method that has two parameters of an array of strings and a string and should returns an int.
It counts how many times the given string appears in the array and returns the count.

for example:

array = ["a","foo","bar","foo","bla"]
string = "foo"

countAppearance(array , string ) -> 2
 */
