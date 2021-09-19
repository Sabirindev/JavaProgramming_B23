package day49_Exceptions;

public class ThrowsKeyword {
    public static void main(String[] args) {




//        //First way to handdle exception by using try and catch
//        System.out.println("test started first");
//        System.out.println("step 1");
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Step 2");
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Test completed last");

        System.out.println("test started first");
        System.out.println("step 1");


            //Thread.sleep(3000);
        sleep(4);



        System.out.println("Step 2");


            //Thread.sleep(3000);
        sleep(2.5);


        System.out.println("Test completed last");
    }


   /*
   public static void sleep(double seconds) throws InterruptedException{
        long milliSeconds = (long) (seconds*1000);
        Thread.sleep(milliSeconds);

    }
    */


    //best way to handle exceptions
    public static void sleep(double seconds)  {
        long milliSeconds = (long)(seconds * 1000);

        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




}
