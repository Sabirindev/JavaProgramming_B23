package day19_ForLoop;

public class NestedLoop1 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {  // i : 0, 1

            for (int j = 0; j <3 ; j++) {  //j: 0 , 1 , 2 , 3

                System.out.print(j+", ");  // 0,
            }
            System.out.println("\n");
        }
    }
}
