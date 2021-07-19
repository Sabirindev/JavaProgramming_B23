package day28_Methods_CustomMethods;

public class CM_Calculator {
    public static void main(String[] args) {

        calculate(100,200,'+');
    }

    public static void calculate(int num1, int num2, char operator) { //+,-,*,/,%

        switch (operator) {
            case '-':
                System.out.println("Substraction: " + (num1 - num2));
                break;
            case '+':
                System.out.println("Addition: " + (num1 + num2));
                break;
            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case '/':
                System.out.println("Division: " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid Entry");

        }

    }
}
