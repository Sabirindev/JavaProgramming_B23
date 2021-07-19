package VII.Methods;

import java.util.Scanner;

public class RM_max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(),b=in.nextInt();
        max(a,b);

    }
    public static int max(int x, int max){
        if (x < max){
            return max;
        }else {
            return x;
        }

    }
}
/*
Finish the method max which has two parameters, x and max.
if x is bigger than max return x
if max is bigger than x return max
all other cases return x

max(1,10) -> 10
max(11,5) -> 11
 */
