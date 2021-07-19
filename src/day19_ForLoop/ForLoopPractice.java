package day19_ForLoop;

public class ForLoopPractice {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++){
            System.out.print(i+",");
        }
        System.out.println("************Odd and even******************");

        for (int i = 1; i <=100; i+=2){
            System.out.print(i+","); // odd numbers between 0-100
        }
        System.out.println("\n");
        for (int i = 0; i<=100; i+=2){
            System.out.print(i+",");  // even numbers between 0-100
        }

        System.out.println("-------------------------------------------------");
        String odds = "";
        String evens = "";

        for (int i = 1; i < 101 ; i++) {
            if(i %2 != 0){
                odds += i+" ";
            }else{
                evens +=  i+" ";
            }
        }


        System.out.println("odds = " + odds);
        System.out.println("evens = " + evens);



    }
}
