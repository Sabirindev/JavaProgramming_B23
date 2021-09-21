package Methods;

public class CM_defineGradesOfStudentBasedOnScores {
    public static void main(String[] args) {
        /*
        6. define the garde of the student based on the score
         */
        grade(95);
        String result = grade1(85);
        System.out.println(result);

    }
    //********************************************************************************
    public static void grade(int score) {
        if (score > 100 || score < 0) { // if the score is invalid
            System.out.println("Invalid");
            return;//exit the method
        } else if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    //********************************************************************************
    public static String grade1(int score) {
        String result = "";

        if (score >= 0 && score <= 100) {
            result = (score >= 90)? "A":(score >= 80)?"B":(score >= 70)?"C":(score >= 60)?"D"
                    :"F";
        } else {
            result = "Invalid";
        }
        return result;
    }
}
