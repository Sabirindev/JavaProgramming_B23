package day49_Exceptions.Day49_Exceptions;

public class Practice {

    public static void main(String[] args) throws InterruptedException {


        Thread.sleep(3000);

        System.out.println("----------------------------");

        try {
            System.out.println(70 / 0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }


        throw new RuntimeException("EXCEPTION IS OCCURED");




    }

}
