package III.Statements;

import java.util.Scanner;

public class biggestOneOfThreeNumbers_nextInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt();
        String result = "";

        if(num1 > num2 && num1 > num3){
            result = "n1 is bigger";
        }else if (num2>num1 && num2>num3){
            result = "n2 is bigger";
        }else{
            result = "n3 is bigger";
        }
        System.out.println(result);
    }
}
/*
Write a program that checks for the biggest of 3 numbers. you get 3 int variables: n1 , n2 and n3

if n1 is biggest output: "n1 is bigger"
if n2 is biggest output: "n2 is bigger"
if n3 is biggest output: "n3 is bigger"
Example:

1
2
1

n2 is bigger
1
2
1

n2 is bigger
3
2
1

n1 is bigger
3
2
1

n1 is bigger
3
2
30

n3 is bigger
 */
