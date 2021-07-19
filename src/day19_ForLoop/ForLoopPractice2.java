package day19_ForLoop;

public class ForLoopPractice2 {
    public static void main(String[] args) {
        //A ~ Z
        for (int i = 65; i <= 90; i++){
            System.out.print((char)i+",");
        }
        System.out.println("\n ****Second way***");
        for (char i = 'A'; i <= 'Z'; i++){
            System.out.print(i+",");
        }
        System.out.println("\n");
        for (char i = 'a'; i <= 'z'; i++){
            System.out.print(i+",");
        }

    }
}
