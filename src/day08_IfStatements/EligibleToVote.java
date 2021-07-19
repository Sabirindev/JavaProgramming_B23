package day08_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {
        int age = 21;
        String citizen = "USA",
                name = "Sabir";

        boolean isEligible = age >= 21 && (citizen == "USA" || citizen =="usa");

        if (isEligible) {

            System.out.println(name + " is eligible to vote");
        }

        if (!isEligible) {

            System.out.println(name + " is not eligible to vote");
        }
    }
}
