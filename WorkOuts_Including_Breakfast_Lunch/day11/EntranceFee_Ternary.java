package day11;

public class EntranceFee_Ternary {
    public static void main(String[] args) {
        String sport = "Tennis";
        int fee = (sport == "Soccer" || sport == "Tennis") ? 100 : 50;
        System.out.println("Enterence fee= " + fee);

    }
}
/*
 Given a sport you play at the community center you will have to pay some entrance fee.

                    Soccer or Tennis fee is: 100
                    Otherwise fee is: 50
               NOTE: MUST APPLY TERNARY
 */
