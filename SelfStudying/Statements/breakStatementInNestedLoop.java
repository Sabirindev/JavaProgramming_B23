package Statements;

public class breakStatementInNestedLoop {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        for (int i = 0; i <= a; i++) {
            System.out.print(i+"\n");
            for (int j = 0; j <= b; j++) {
                if(j==2){
                    break;  // when j == 2, break statement gets executed, and stop the inner loop
                                //not outter loop. >> for (int j = 0; j <= b; j++)
                }
                System.out.print(j+",");
            }
            System.out.println();
        }
    }
}
