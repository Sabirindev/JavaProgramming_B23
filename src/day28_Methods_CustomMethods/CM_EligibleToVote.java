package day28_Methods_CustomMethods;

public class CM_EligibleToVote {
    public static void main(String[] args) {
        eligibleToVote(35, true);
    }
    public static void eligibleToVote(int age, boolean isUSCitizen){
        if (age>=21 && isUSCitizen){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not Eligible to vote");
        }

    }
}
/*
4. check eligibility to vote
 */