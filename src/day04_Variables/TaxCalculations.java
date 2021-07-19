package day04_Variables;

public class TaxCalculations {
    public static void main(String[] args) {
        int salary = 100000;
        double stateTax = 0.08,
                federalTax = 0.21,
                totalStateTax = salary * stateTax,
                totalFederalTax = salary * federalTax,
                salaryAfterTax = salary - totalStateTax-totalFederalTax;

        System.out.println("Your salary is "+salary);

        //You eed to pay totalStateTax yo state tax
        System.out.println("You need to pay $"+totalStateTax + " to state tax");

        //You eed to pay totalFederalTaxto federal tax
        System.out.println("You need to pay $"+totalFederalTax + " to federal tax");

        //Your take home salary is salaryAfterTax
        System.out.println("you take home salary is "+salaryAfterTax);
    }
}
