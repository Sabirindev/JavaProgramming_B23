package day21_BranchingStatement_While_Loop;

public class WhileLoopPractice2 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.print(i + ","); // print out even numbers between 1~10
            }
            i++;
        }
        System.out.println();
        System.out.println("**********************************");

        for (int j = 1; j <= 10; j++) {
            if (j % 2 == 0) {
                System.out.print(j + ","); //print out even numbers between 1~10
            }
        }
    }
}
