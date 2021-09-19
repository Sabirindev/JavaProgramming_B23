package day08_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {
        int age = 21;
        String citizen = "USA",
                name = "Sabir";

        boolean isEligible = age >= 21 &&  (citizen.equalsIgnoreCase("USA"));


        String s1 = "book";
        String s2 = "book";  // string pool memory

        System.out.println(s1==s2);//true
        System.out.println(s1.equals(s2));//true


        String s3 = new String("book");// out of string pool
        String s4 = new String("book");


        System.out.println(s1==s3);//false
        System.out.println(s1.equals(s3));//true

        if (isEligible) {
            System.out.println("Atilla");
            System.out.println(name + " is eligible to vote");
        }

        if (!isEligible) {

            System.out.println(name + " is not eligible to vote");
        }
    }
}
