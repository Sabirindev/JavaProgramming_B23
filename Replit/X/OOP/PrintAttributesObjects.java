package X.OOP;

import java.util.Scanner;

public class PrintAttributesObjects {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintAttributes a = new PrintAttributes();
        a.name = in.next();
        a.color = in.next();
        a.amount = in.nextInt();

        System.out.println(a.asString());
    }
    }

