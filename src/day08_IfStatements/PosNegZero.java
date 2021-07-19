package day08_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {
        int number = 100;

        boolean positive = number > 0,
                negative = number <0,
                zero = number ==0;

        if (positive){ // if the number is positive

            System.out.println(number + " is positive");
        }

        if (negative) { // if the number is negative

            System.out.println(number+ " is negative");
        }

        if (zero){ // if the number is zero
            System.out.println(number + " is zero");
        }
        System.out.println((double)(10/3));
        System.out.println((double)10/3);
    }
}
