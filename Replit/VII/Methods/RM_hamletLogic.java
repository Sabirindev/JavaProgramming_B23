package VII.Methods;

import java.util.Scanner;

public class RM_hamletLogic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(hamletQuote(scan.nextBoolean(),scan.nextBoolean()));
    }
    public static boolean hamletQuote(boolean toBe,boolean notToBe){
        if (toBe == false && notToBe == false){
            return toBe;
        }else {
            return true;
        }
    }
}
/*
The famous quote is "to be or not to be" is a classic example of boolean logic.
the hamletQuote method only returns true if one or both of the boolean parameters is true.

Examples:

hamletQuote(true, false)
returns true

hamletQuote(false,true)
returns true

hamletQuote(true,true)
returns true

hamletQuote(false,false)
returns false

hint: use the truth table for this one, this can be done with one if and a logical operator.
 */
