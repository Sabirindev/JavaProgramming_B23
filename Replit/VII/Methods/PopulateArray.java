package VII.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class PopulateArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        arr = populate(arr);
        System.out.println(Arrays.toString(arr));
        scan.close();
    }
    public static int[] populate(int array[]){
        int j = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = j++;
        }
        return array;
    }
}
/*
The **populate** method accepts an empty int array and
populates it with numbers counting up.

Example:

populate(new int[3])
returns:[1,2,3]

populate(new int[5])
returns:[1,2,3,4,5]

hint:

use a for loop and use the iterator as the current elements value.
 */
