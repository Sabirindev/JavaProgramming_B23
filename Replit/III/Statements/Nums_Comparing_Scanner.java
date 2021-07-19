package III.Statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Nums_Comparing_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 2 numbers:");
        int num1 = scan.nextInt(), num2 = scan.nextInt();
        String result = "";

        if (num1>num2){
            result = num1+" is greater than "+num2;
        }else if (num2 > num1){
            result = num2+" is greater than "+num1;
        }else{
            result = num1+" and "+num2+" are equal";
        }
        System.out.println(result);
    }
}
/*
You have two numbers already declared and assigned values.

Check if num1 and num2 are equal, or not. Please follow the below examples and print message accordingly:

Enter 2 numbers:
10
10

10 and 10 are equal
Enter 2 numbers:
10
10

10 and 10 are equal
Enter 2 numbers:
100
55

100 is greater than 55
Enter 2 numbers:
100
55

100 is greater than 55
Enter 2 numbers:
33
333

333 is greater than 33
 */
