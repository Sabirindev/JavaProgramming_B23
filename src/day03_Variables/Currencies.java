package day03_Variables;

public class Currencies {
    public static void main(String[] args) {
        int dollar = 100;

        double lira = dollar * 8.41;
        double euro = dollar * 0.81;
        double ruble = dollar * 73.6;

        System.out.println("Dollar = "+ dollar);
        System.out.println("Lira ="+ lira);
        System.out.println("Euro = "+euro);
        System.out.println("Ruble = "+ruble);
    }
}
