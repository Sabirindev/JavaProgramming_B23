package day19_ForLoop;

public class nestedLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {          // i : 0; >>       // j: 0, 1, 2, 3, 4
                 //1      //2                        // i: 1;   >>     // j: 0, 1, 2, 3, 4
                                               // i: 2;  >>     // j: 0, 1, 2, 3, 4
           // 3 : body
            System.out.println("\n"+i+"\n");

            for (int j = 0; j < 5; j++) {
                System.out.print(j+",");
            }
            //System.out.println("");
        }
    }
}
