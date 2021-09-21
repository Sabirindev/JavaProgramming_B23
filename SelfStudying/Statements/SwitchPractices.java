package Statements;

public class SwitchPractices {
    public static void main(String[] args) {

        long a = 10L; // a's data type is long
        switch ((int)a){ // explicit casting is performed (long to int) because
                        // switch does not accept data types such as long, float, double and boolean
            case 9:
                System.out.println("The  number is 9");
                break;
            case 10:
                System.out.println("The number is 10");
                break;

            case 11:
                System.out.println("the number is 11");
                break;
            default:
                System.out.println("Wrong number is entered");
        }

        System.out.println("*********************************");
              char ch = 'a';
        switch (ch) { // explicit casting is performed (long to int) because
            // switch does not accept data types such as long, float, double and boolean
            case 'b':
                System.out.println("letter is b");
                break;
            case 'A':
                System.out.println("letter is A");
                break;
            case 'a':
                System.out.println("letter is a");
                break;
            default:
                System.out.println("Wrong letter ");

        }


    }
}
