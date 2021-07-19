package day07_ShortHand_Relational;

public class ShortHandOperators {
    public static void main(String[] args) {

        String name1 = "Muhtar";
        String name2 = "Sabir";

        String name3 = name2; // name3 = "Sabir"

        name2 = name1; // name2 = "Muhtar"
        name1 = name3; // name1 = "Sabir"

        System.out.println("************************************");

        int balance = 300;
        balance = balance + 200; // balance += 200;   is as same as  balance = balance + 200;

        System.out.println(balance);

        balance += 1000;

        System.out.println("balance = "+balance);
        System.out.println("****************************");

        String school = "Cybertek";
        school += "School";

        System.out.println("school = "+ school);

        String name = "John";
        String lastName = "Daniel";

        name += " "+lastName;

        System.out.println("Full name is: "+name);

        System.out.println("*************************************");
        //withdraw

        balance -=300;
        System.out.println("balance = "+ balance);

        balance -= 1000;
        System.out.println("balance = "+ balance);

        System.out.println("********************************************");

        //*=

        double salary = 100000;
        salary *= 2;

        System.out.println("salary = "+"$"+ salary);

        //0.65
        salary *= 0.65;

        System.out.println("Salary after tax: "+ "$"+salary);

        System.out.println("****************************************");

        // /=

        int slices = 10;
        slices /= 5;

        //slices /= 0; it is gonna infinity or error

        System.out.println("slices = "+ slices);

        System.out.println("******************************");

        // %=
        int cents = 105;
        int quarters = cents/25;

        cents %= 25;
        System.out.println("quarters = "+quarters);
        System.out.println("cents ="+ cents);




    }
}
