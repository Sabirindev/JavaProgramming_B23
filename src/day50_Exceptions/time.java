package day50_Exceptions;

public class time {
    public static void main(String[] args) {
        for (int i = 1; i <=30; i++) {
            System.out.println("Push-up "+i);
            pause(2.5);
        }

        System.out.println("\n****************************************************");

        for (int i = 1; i <=20 ; i++) {
            System.out.println("Pull-up "+i);
            pause(3.5);


        }

        System.out.println("\n***********************************************");

    }

    public static void pause(double seconds){
        try {
            Thread.sleep((long)(seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //                 (long)     (2.5 * 1000)
        //                                2500.0
    }
}
/*
MorningWorkOut:
        1. Do 30 push-ups
                try pausing 2.5 seconds in each

        2. Do 20 Pull-ups
                try pausing 3.5 seconds in each
 */
