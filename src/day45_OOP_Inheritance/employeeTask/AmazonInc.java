package day45_OOP_Inheritance.employeeTask;

public class AmazonInc {//AmazonInc Has A tester
                        //AmazonInc Has A Developer

    public static void main(String[] args) {

        System.out.println("\n******************** Tester **********************************\n");
        Tester tester = new Tester("Robinson Cruzo",'M',36,11,"SDET",165000);
        tester.eat("steak");
        tester.sleep();
        tester.testing();

        System.out.println("\n******************** Developer **********************************\n");

        Developer developer = new Developer("Sabir",'M',35,13,"Software Developer",185000);
        developer.eat("dolma");
        developer.sleep();
        developer.code();
        developer.fixBugs();

        System.out.println("\n******************** Driver **********************************\n");


        Driver driver =new Driver("Receb",'M',40,20,"truck driver",120000);
        driver.eat("fish");
        driver.sleep();
        driver.drive();
        System.out.println(driver);
    }
}
