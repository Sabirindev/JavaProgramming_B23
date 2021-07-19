package day21_BranchingStatement_While_Loop;

public class Break_VS_Exit {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3){
                //break; // break exits from loop on;y
                System.exit(0); // terminates the system
                //exit is gonna be terminate whole system wheneve i = 3
                //after exit runing nothing will be executes after exit
            }
            System.out.println("Cybertek School");
        }
        System.out.println("Batch 23");
    }
}
