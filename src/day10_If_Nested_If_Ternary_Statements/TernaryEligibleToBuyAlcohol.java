package day10_If_Nested_If_Ternary_Statements;

public class TernaryEligibleToBuyAlcohol {
    public static void main(String[] args) {
        int age = 21;
        String eligibility = "", name = "Trump";
        eligibility = (age >= 21) ? " is eligible to buy alcohol" : " is not eligible to buy alcohol";
        System.out.println(name + eligibility);
    }
}
