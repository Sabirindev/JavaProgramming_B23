package arraysClass;

import java.util.Arrays;

public class CharArrayPractice {
    public static void main(String[] args) {

        char Ch[] = new char[10];
        System.out.println(Arrays.toString(Ch));
        boolean bl[] = new boolean[5];
        System.out.println(Arrays.toString(bl));

        int n[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};

        for (int i = n.length-4; i < n.length; i++) {
            System.out.print(n[i]+ " ");
        }
    }
}
