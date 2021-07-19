package day04_Variables;

public class CarShop {
    public static void main(String[] args) {
        String brand = "Toyota",
                model = "Camry",
                color = "white";
        int year = 2012,
                miles = 13;
        double price = 24000;

        System.out.println("*****Car Info*****"+"\n"+
                year+" "+brand+" "+model+", "+color+", "+miles+" miles,"+" $"+price);
        /*
        *****Car Info*****
2012 Toyota Camry, white, 13 miles, $24000.0
         */
    }
}
