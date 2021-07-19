package day21;

public class ReturnDigitFromString {
    public static void main(String[] args) {
        String str = "A1B2C3";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachCh = str.charAt(i);
            System.out.println(eachCh);
            if (eachCh >= '0' && eachCh <= '9' ){
                //sum += eachCh - '0'; == sum  += eachCh -48; they both same
                sum  += eachCh -48; // in order to convert char digit to integer number we can use 48 or '0'
                //sum += eachCh; // it is gonna be 49(1) + 50(2) + 51(3) = 150
            }
        }
        System.out.println("sum = "+sum);
    }
}
/*
3. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6
 */
