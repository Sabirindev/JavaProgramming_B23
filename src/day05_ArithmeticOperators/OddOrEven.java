package day05_ArithmeticOperators;

public class OddOrEven {
    public static void main(String[] args) {
        int number = 100;
        boolean isEven = number%2 == 0;
        boolean isOdd = number%2 != 0;

        System.out.println(number+ " is an even number: "+ isEven);
        System.out.println(number + " is an Odd number: "+ isOdd);

    }
}
