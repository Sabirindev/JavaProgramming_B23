package day49_Exceptions;

public class tryCatch {

    public static void main(String[] args) {
        try {
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println("aaa");
        }
    }
}
