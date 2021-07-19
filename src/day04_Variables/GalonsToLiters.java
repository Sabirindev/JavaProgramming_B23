package day04_Variables;

public class GalonsToLiters {
    /*
     create a class called GalonsToLiters, and write a program that can convert the gallons to liter
            Ex:
                galon = 10;

           Hint: 1 gallon = 3.78541 liters
     */
    public static void main(String[] args) {

        double gallon = 10;
        double litters = gallon * 3.78541;

        System.out.println(gallon+" gallon = "+litters+" litters");
    }

}
