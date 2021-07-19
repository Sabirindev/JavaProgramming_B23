package III.Statements;

import java.util.Scanner;

public class ApartmentLeasingI_String_if_elseif_else {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");
        int numberOfbedroom = scan.nextInt(),
                startingPrice = 0;

        if (numberOfbedroom>0 && numberOfbedroom < 4) {
            if (numberOfbedroom == 1) {
                System.out.println("One Bedroom Selected" + "\n" +
                        "Starting Price: " + (startingPrice + 1100));
            } else if (numberOfbedroom == 2) {
                System.out.println("Two Bedroom Selected" + "\n" +
                        "Starting Price: " + (startingPrice + 1850));
            } else {
                System.out.println("Three Bedroom Selected" + "\n" +
                        "Starting Price: " + (startingPrice + 2550));
            }
        }else{
            System.out.println("No such Bedrooms available");
        }
        scan.close();
    }
}
