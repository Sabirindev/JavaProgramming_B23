package day04_Variables;

public class KgToPounds {
    /*
    create a class called KgToPounds, and write a program that can convert the given Kg to pound and print the result
            Ex:
               if kg = 10;

                output:
                    22.0462

               Hint: 1 kg = 2.2 pounds
     */

    public static void main(String[] args) {

        double kg = 10;
        double pound = kg*2.2;
        System.out.println(kg+" kg = "+pound+" pound");

    }
}
