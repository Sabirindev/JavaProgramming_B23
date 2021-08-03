package day39_CustomClass_Statics.salaryCalculatorTask;

public class EmployeeSalaries {
    public static void main(String[] args) {
        //emplyee1: 65 $/h, 7% state tax, 23% federal tax, 45 hours per week
        SalaryCalculator employee1 = new SalaryCalculator();
        employee1.setInfo(65,7,23,45);
        System.out.println(employee1);

        //employee2: 52 $/h, 5% state tax, 25% federal tax, 40 hours per week
        SalaryCalculator employee2 = new SalaryCalculator();
        employee2.setInfo(50,5,25,40);
        System.out.println(employee2);
    }
}
