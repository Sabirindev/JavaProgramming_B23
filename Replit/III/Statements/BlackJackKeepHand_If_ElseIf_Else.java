package III.Statements;

import java.util.Scanner;

public class BlackJackKeepHand_If_ElseIf_Else {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the player and house scores:");

        int house = scan.nextInt(), player = scan.nextInt();
        String result;

        if (house > 0 && player > 0){
            if (player > 21){
                result = "player bust";
            }else if (player > house){
                result = "player win";
            }else if (house > player){
                result = "player loss";
            }else {
                result = "its a tie";
            }

        }else{
            result = "Scores enterted should be bigger than \'0\'";
        }
        System.out.println(result);
        scan.close();
    }
}
/*
In blackjack after the player asks to keep the house 4 things may happen.
if the card total is bigger then 21 the player busts.
if the house score is bigger then the player, the player loses .
if the player score is equal to the house then they are a draw.

if the player score is bigger then the house the player wins.

player and house scores are represented by player and house int variables.

check them using ifs to determine the result.

Example:

input:
8
21

output: player win
input:
8
21

output: player win
input:
10
7

output: player loss
input:
10
7

output: player loss
input:
4
4

output: its a tie
input:
4
4

output: its a tie
input:
 7
 12

output: player win
input:
 7
 12

output: player win
input:
10
25

output: player bust
 */
