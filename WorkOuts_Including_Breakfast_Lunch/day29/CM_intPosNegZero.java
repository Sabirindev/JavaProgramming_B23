package day29;

public class CM_intPosNegZero {
    public static void main(String[] args) {
        posNegZero(5);

    }
    static void posNegZero(int num){
        if (num > 0){
            System.out.println(num+" is positive");
        }else if (num < 0){
            System.out.println(num+" is negative");
        }else{
            System.out.println(num+" is zero");
        }
    }
}
/*
1. create a function that can check if the given integer is positive, negative or zero
 */
