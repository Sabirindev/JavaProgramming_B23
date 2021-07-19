package day28_Methods_CustomMethods;

public class CustomMethod_Print_OddNumbers1To100 {
    public static void main(String[] args) {
        OddNumbers();
    }

    public static void OddNumbers(){
        for (int i = 1; i <= 100; i++) {
            if(i%2== 1){
                System.out.print(i+",");
            }
        }
    }
}
/*
    1. create a method that can print odd numbers between 1~100 in a same line seperated by space
 */
