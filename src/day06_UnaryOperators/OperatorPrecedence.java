package day06_UnaryOperators;

public class OperatorPrecedence {
    public static void main(String[] args) {
        // System.out.println("Addition "+ 2 - 3); it is gonna be error. becuase we can NOT substract(-) from string
        // addition (+) it is not math, it is concatenation (+)

        System.out.println("Addition: " + (2 + 3));

        System.out.println("=========================================================");
        int a = 10;
        int b = 2;



        System.out.println("Addition: "+ (a +b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + a * 10);
        System.out.println("");

    }
}
