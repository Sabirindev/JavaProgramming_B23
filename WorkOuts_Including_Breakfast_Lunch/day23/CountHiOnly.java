package day23;

import java.util.Scanner;

public class CountHiOnly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int countHi =0;

        String hi[] = str.split(" ");

        for (int i = 0; i < hi.length; i++) {
            if (hi[i].equalsIgnoreCase("hi") || hi[i].equalsIgnoreCase("hi.")) {
                countHi++;
            }
        }

        System.out.println(countHi);
        scan.close();
    }
}
