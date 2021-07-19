package III.Statements;

import java.util.Scanner;

public class LaptopConfigurator_if_elseif_else {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalPrice = 0;
        String result = "";

        System.out.println("Select screen size:");
        double screenSize = scan.nextDouble();
        //***Screen Size***
        if (screenSize == 13.3) {
            totalPrice = totalPrice + 200;
        } else if (screenSize == 15.0) {
            totalPrice = totalPrice + 300;
        } else if (screenSize == 17.3) {
            totalPrice = totalPrice + 400;
        } else {
            System.out.println("Sorry, We do not have that size of screen");
        }

        System.out.println("Select CPU type:");
        String CpuType = scan.next();
        //***CPU Type***
        if (CpuType.equalsIgnoreCase("i3")) {
            totalPrice = totalPrice + 150;
        } else if (CpuType.equalsIgnoreCase("i5")) {
            totalPrice = totalPrice + 250;
        } else if (CpuType.equalsIgnoreCase("i7")) {
            totalPrice = totalPrice + 350;
        } else {
            System.out.println("Sorry, We do not have that type of CPU");
        }

        System.out.println("Select RAM size:");
        int RamSize = scan.nextInt();
        int RamsizePer4 = RamSize / 4;
        //***RAM Size***
        if (RamSize % 4 == 0) {
            totalPrice = totalPrice + (RamsizePer4 * 50);
        } else {
            System.out.println("Sorry, We do not have that size of RAM, please enter this range 4..8..12..16..");
        }

        System.out.println("Select storage type:");
        String HardDisk = scan.next();

        System.out.println("Enter memory size:");
        int Memory = scan.nextInt();
        int MemoryPer500GB = Memory / 500;
        //***Storage Type***
        if (HardDisk.equalsIgnoreCase("HDD")) {
            totalPrice = totalPrice + (MemoryPer500GB * 50);
        } else if (HardDisk.equalsIgnoreCase("SSD")) {
            totalPrice = totalPrice + (MemoryPer500GB * 100);
        } else {
            System.out.println("Sorry, We do not have that type of Memory,\nor size of Memory,please enter this range 500..1000..1500..");
        }

        System.out.println("Enter screen resolution:");
        String ScreenResolution = scan.next();
        //***Scree Resolution***
        if (ScreenResolution.equalsIgnoreCase("FULLHD")) {
            totalPrice = totalPrice + 100;
        } else if (ScreenResolution.equalsIgnoreCase("4K")) {
            totalPrice = totalPrice + 200;
        } else {
            System.out.println("Sorry, We do not have that type of Screen Resolution");
        }

        //****Total Price Of Laptop***
        System.out.println("Laptop price is: " + "$"+totalPrice);
        scan.close();
    }
}
/*
Write a program that will calculate laptop price based on the components.

First ask user for a screen size.
- If screen size is equals to 13.3, add  $200 to the laptop price.
- If screen size is equals to  15.0 - add  $300 to the laptop price.
- If screen size is equals to  17.3 - add  $400 to the laptop price.

Then ask user for CPU type.
- If CPU type equals to i3, add  $150 to the laptop price.
- If CPU type equals to i5, add  $250 to the laptop price.
- If CPU type equals to i7, add  $350 to the laptop price.

Then ask user for RAM size.
- Add  $50 for every 4GB of ram to the laptop price.

Then, ask user for storage type. There are 2 options: SSD and HDD.
- If it's HDD - add $50 to the laptop price for every 500gb.
- If it's SSD - add $100 to the laptop price for every 500GB.

Then ask user for for screen resolution. There are 2 options: FULLHD and 4K.
- Add $100 if it's FULLHD screen
- Add $200 if it's 4K screen.

Example:

```
Display message: Select screen size:
input: 13.3
Display message: Select CPU type:
input: i7
Display message: Select RAM size:
input: 8
Display message: Select storage type:
input: SSD
Display message: Enter memory size:
input: 1000
Display message: Enter screen resolution:
input: 4K
Display message: Laptop price is: $1050.0
```

Example #2


```
Display message: Select screen size:
input: 13.3
Display message: Select CPU type:
input: i3
Display message: Select RAM size:
input: 4
Display message: Select storage type:
input: HDD
Display message: Enter memory size:
input: 500
Display message: Enter screen resolution:
input: FULLHD
Display message: Laptop price is: $550.0
 */
