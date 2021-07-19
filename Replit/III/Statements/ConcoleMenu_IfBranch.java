package III.Statements;

import java.util.Scanner;

public class ConcoleMenu_IfBranch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("---------------"+"\n"+
                            "select an option:"+"\n"+
                            "1) option 1"+"\n"+
                            "2) option 2"+"\n"+
                            "3) option 3"+"\n"+
                           "---------------");
        int intOption = scan.nextInt();
        String stringResult = "";

        //****Without 'Else' statement***
        if(intOption == 1){
            stringResult = "user selected 1";
        }else if (intOption == 2){
            stringResult = "user selected 2";
        }else if (intOption == 3){
            stringResult = "user selected 3";
        }else if (intOption < 1 || intOption >3){
            stringResult = " user selected Invalid option";
        }
        System.out.println(stringResult);
    }
}
/*
A console menu is basically a text menu. After it is outputted to the console a user input is captured. Then the program decides what to do according to the user input (what the user selected).

This is done using separate if statements(without else) or branched if statements.

Uur console menu has 3 items called "options"

Flow:

Prints:
---------------
select an option:
1) option 1
2) option 2
3) option 3
---------------
Prints:
---------------
select an option:
1) option 1
2) option 2
3) option 3
---------------
if choice is 1
print:
user selected 1

if choice is 2
print:
user selected 2

if choice is 3
print:
user selected 3
 */
