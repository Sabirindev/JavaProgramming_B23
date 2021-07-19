package day09_IfStatements;

public class GreaterOrEqual {
    public static void main(String[] args) {
        int num1 = 5,
                num2 = 15;
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println(num1 + " and " + num2 + " are equal");
        }
    }
}
