package day12;

public class FizzBuzz {
    public static void main(String[] args) {
        int number = 5;
        String reult = "";

        switch (number){
            case 3:
            case 6:
            case 9:
                reult = "Fizz";
                break;

            case 1:
                reult = "One";
                break;
            case 2:
                reult="Two";
                break;
            case 4:
                reult="Four";
                break;
            case 7:
                reult = "Seven";
                break;

            case 5:
            case 10:
                reult = "Buzz";
                break;

            default:reult="Invalid number";
        }
        System.out.println(reult);
    }
}
/*
write a program that can print any number between 1 ~ 10,
but for number which is a multiple of 3 print "Fizz" instead of the number
 and for number which is a multiple of 5, print "Buzz" instead of the number,
  and for number which is a multiple of both 3 and 5 both print "FizBuzz" instead of the number.

                  MUST use switch statement
 */
