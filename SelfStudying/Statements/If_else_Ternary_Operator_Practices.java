package Statements;

public class If_else_Ternary_Operator_Practices {
    public static void main(String[] args) {

        int age = 21;
        System.out.println("************if statement *************************");
        if (age > 18) {
            System.out.println("He/She is an adult");
        } else {
            System.out.println("He/She is Not an adult");
        }

        System.out.println("************Ternary operator*************************");

        int num = 20;

        String result = (num % 2 == 0) ? "Even" : "true";
        System.out.println(result);

        boolean isTrueOrFalse = (num % 2 == 1) ? true : false;
        System.out.println(isTrueOrFalse);

    }
}
