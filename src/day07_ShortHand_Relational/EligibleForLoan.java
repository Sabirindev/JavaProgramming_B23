package day07_ShortHand_Relational;

public class EligibleForLoan {
    public static void main(String[] args) {

        String name = "Trump";

        double income = 59000.90,
                workHistory = 1.5;

        int age = 99,
                creditScore = 303;

        boolean isEligibleForLoan = income >=60000 && workHistory >=2 && creditScore >= 700 && age >18;

        System.out.println(name+" is eligible for loan: "+ isEligibleForLoan);

        char ch = 65;

        System.out.println(ch);

    }
}
