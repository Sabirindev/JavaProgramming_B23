package day13_Scanner_Methods;

import java.util.Scanner;

public class ShippingInfo_Next_NextLine_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your building number:");
        int buildingNum = scan.nextInt();

        scan.nextLine(); //and if different scanner method comes before nextLine method we will
                        //add one more nextLine() method to clean up Scanner memory to make sure that nothing
                        //left there

        System.out.println("Enter your street address:");
        String streetAddress = scan.nextLine();

        System.out.println("Enter your city name:");
        String cityName = scan.nextLine();

        System.out.println("Enter your state name:");
        String stateName = scan.next();

        System.out.println("Enter your zip code:");
        String zipCode = scan.next();

        System.out.println("Enter your full name: ");
        scan.nextLine();
        String fullName = scan.nextLine();

        System.out.println(fullName+"\n"+buildingNum +" "+streetAddress+"\n"+cityName+", "+stateName+" "+zipCode);


    }
}
/*
ShippigInfo
ask the followings:
1.Building number (nextInt)
2.Street Address (nextLine)
3.City Name (nextLine)
4.State (next)
5.Zip Code (next)
6.Full Name (nextLine)

print shipping info
 */
