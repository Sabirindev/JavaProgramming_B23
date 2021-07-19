package day23_Arrays;

public class NestedLoop2 {
    public static void main(String[] args) {
        for (int i = 1; i <=8; i++) { //i number of lines
            for (int j = 1; j <=i; j++) { // j: number of * in  each line
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
