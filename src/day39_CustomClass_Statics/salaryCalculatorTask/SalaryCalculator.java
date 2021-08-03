package day39_CustomClass_Statics.salaryCalculatorTask;

public class SalaryCalculator {

    public double hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public double weeklyHours;

    public void setInfo(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        return hourlyRate*weeklyHours*52;
    }
    public double stateTax(){
        return salary() * stateTaxRate;

    }

    public double federalTax(){
        return salary()*federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary() - stateTax() - federalTax();
    }

    public String toString() {
        return "SalaryCalculator{" +
                "salary = $" + salary() +
                ", stateTax = $" + stateTax() +
                ", federalTax = $" + federalTax() +
                ", weeklyHours = $" + salaryAfterTax() +
                '}';
    }
}
/*
 SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

        Actions:
            setInfo(): sets all the fields of SalaryCalculator
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
            stateTax(): claculates the totalstateTax
            federalTax(): calculates the total federal tax
            salaryAfterTax(): calculates the salary after tax
            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */
