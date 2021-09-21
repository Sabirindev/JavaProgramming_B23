package VIII.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAll {
    public static ArrayList<Boolean> repeatAll(ArrayList<Boolean> arrL2){
        ArrayList<Boolean> arrL3 = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            arrL3.addAll(arrL2);
        }
        return arrL3;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Boolean> arrL1 =new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrL1.add(in.nextBoolean());
        }

        System.out.println(repeatAll(arrL1));
    }
}
/*
Create a static method that:

is called repeatAll
returns ArrayList of Booleans
takes in a single parameter - an ArrayList of Booleans

This method should modify its ArrayList parameter by repeating its ArrayList values.

For example, if the parameter is
(true, false, false)
The modified ArrayList should be
(true, false, false, true, false, false)
 */
