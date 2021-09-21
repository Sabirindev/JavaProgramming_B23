package III.Statements;

import java.util.Scanner;

public class ApartmentLeasingI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");
        int numberOfbedroom = scan.nextInt();
                int startingPrice = 0;



        //String invalidInput = "a"+numberOfbedroom;
        //System.out.println(invalidInput);

        //boolean validInput = invalidInput.charAt(1)>'0' && invalidInput.charAt(1)<='9';

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
/*
Write program for Leasing office.

numberOfBedrooms variable already declared and assigned value using Scanner:

startingPrice is set to 0.

> **prices**
> 1 bedroom - 1100
> 2 bedroom - 1850
> 3 bedroom - 2550


Example Flow:
```
Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
1
One Bedroom Selected
Starting Price: 1100
```

```
Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
3
Three Bedroom Selected
Starting Price: 2550
```

```
Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
5
No such Bedrooms available

```
Note: If an invalid bedroom number is given no price is displayed
 */
