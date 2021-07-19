package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {

        System.out.println(!false); // true

        System.out.println(true == !false); // true = true => true

        System.out.println(true != !true); // true

        System.out.println("****************************************************");

        int score = 80;
        boolean passed = score >= 60;
        boolean failed = !passed; //boolean failed = score < 60;

        System.out.println("*****************************************************");

        int age = 21;

        boolean eligible = age >=  21;
        boolean notEligible = !eligible;

        System.out.println(eligible +"\n"+notEligible);


    }
}
