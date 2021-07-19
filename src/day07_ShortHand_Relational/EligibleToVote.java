package day07_ShortHand_Relational;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Aaron King",
                citizen = "UK";
        int age =34,
                creditScore = 630;

        boolean isEligibleToVote = age > 18 && citizen == "USA" && creditScore >= 700;

        System.out.println(name+" is eligible to vote for Biden: "+isEligibleToVote);

    }
}
