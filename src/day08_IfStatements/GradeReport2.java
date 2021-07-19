package day08_IfStatements;

public class GradeReport2 {
    public static void main(String[] args) {
        int score = 95;

        boolean madeA = score >= 90 && score <= 100,
                madeB = !madeA && score >= 80,
                madeC = !madeA && !madeB && score >= 70,
                madeD = !madeA && !madeB && !madeC && score>= 60,
                madeF = score <= 59;

        if (madeA){

            System.out.println("Excellent, You made an A");
        }

        if (madeB){
            System.out.println("Good, You made a B");
        }
        if (madeC){
            System.out.println("You made a C");

        }
        if (madeD){
            System.out.println("You made a D");
        }
        if (madeF){

            System.out.println("Unfortunatly, You just failed");
        }

    }
}
