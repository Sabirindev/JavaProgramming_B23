package VII.Methods;

import java.util.Scanner;

public class RM_profitOrLoss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(profits(scan.nextInt(), scan.nextInt()));
    }

    public static String profits(int buyPrice,int sellPrice){
        if (buyPrice < sellPrice){
            return "profit";
        }else if (buyPrice > sellPrice){
            return "loss";
        }else {
            return "no loss";
        }

    }
}
/*
Finish the profits method which accepts the buyPrice(int) and sellPrice(int)
and determines if there was a profit or loss.

It returns a string value that can be "profit","loss","no loss"

Example

profits(100,1500)
returns: "profit"

profits(20,5)
returns: "loss"

profits(100,100)
returns: "no loss"
 */
