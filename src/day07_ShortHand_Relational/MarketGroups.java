package day07_ShortHand_Relational;

public class MarketGroups {
    public static void main(String[] args) {
        int score = 42;

        boolean isEarlyBird = 50 <= score && score <=60,
                group1 = 40 <= score && score <=49,
                group2 = 30 <= score && score <=39,
                angryBird = score <30;

        System.out.println("EarlyBird = "+ isEarlyBird);
        System.out.println("Group1 = "+ group1);
        System.out.println("Group2 = " +group2);
        System.out.println("AgryBird = "+angryBird);
    }
}
