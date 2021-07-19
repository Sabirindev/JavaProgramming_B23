package day11;

public class LoanAprovement_Ternary {
    public static void main(String[] args) {
        double yearlySalary= 65000;
        int creditScore = 713;
        String result = "";

        result = (yearlySalary>=60000 && creditScore>=650)?"Loan is approved":"Loan is denied";
        System.out.println(result);
    }
}
/*
Given two values: yearly salary and credit score determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650
                    Otherwise print: "Loan Denied"
             NOTE: MUST APPLY TERNARY
 */
