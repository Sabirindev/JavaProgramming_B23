package day10_If_Nested_If_Ternary_Statements;

public class TernaryEligibleToVote {
    public static void main(String[] args) {
        int age = 21;
        boolean isCitizen = true;
        String eligibility = "",
                name = "Jimmy";

        eligibility = (age >= 21 && isCitizen) ? " is eligible to vote" : " is not eligible to vote";
        System.out.println(name + eligibility);
    }
}
