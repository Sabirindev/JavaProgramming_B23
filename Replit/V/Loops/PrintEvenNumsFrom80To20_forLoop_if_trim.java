package V.Loops;

public class PrintEvenNumsFrom80To20_forLoop_if_trim {
    public static void main(String[] args) {

        String result ="";
        for (int i = 80; i >= 20; i--) {
            if (i%2==0){
                result +=i+" ";
            }
        }
        System.out.print(result.trim());
    }
}
/*
Write a for loop that prints all even integers from 80 through and including 20.
Seperate each number with a space
 */
