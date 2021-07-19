package day19_ForLoop;

public class EmptyRectange {
    public static void main(String[] args) {

        System.out.println("* * * * * *");
        for (int i = 1; i <=8 ; i++) {
            System.out.println("*         *");
        }
        System.out.println("* * * * * *");

      /*
        // Question 2: which is I made a mistake
        String ta = "A";
        ta = ta.concat("B");//AB
        String tb = "C";
        ta =ta +tb;//ABC
        ta.replace('C','D');// should be "ABD" but if we dont assign such as ta=ta.replace('C','D');
                                            // ta value still be "ABC"
        ta = ta + tb; // ABC + C
        System.out.println(ta); // "ABCC"

       */

    }
}
/*
3. print the following shape:
                        * * * * * *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        * * * * * *

    Hint: in the loop body , only place the statements that you need to repeat
 */
