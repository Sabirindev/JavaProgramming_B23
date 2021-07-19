package day10_If_Nested_If_Ternary_Statements;

public class TripBaseOnGrade {

    public static void main(String[] args) {
        int grade = 3,
                numOfGroup = 0;
        String location = "",
                teachnerInCharge = "",
                info = "";

        if (grade > 0 && grade < 7) {
            if (grade == 1) {
                location = "Apple Orchard";
                numOfGroup = 3;
                teachnerInCharge = "Ms. Smith";
            } else if (grade == 2) {
                location = "Zoo";
                numOfGroup = 7;
                teachnerInCharge = "Mr. Lee";
            } else if (grade == 3) {
                location = "Aquarium";
                numOfGroup = 5;
                teachnerInCharge = "Ms. Wilson";
            } else if (grade == 4) {
                location = "Movie theater";
                numOfGroup = 2;
                teachnerInCharge = "Ms. Reyes";
            } else if (grade == 5) {
                location = "Museum";
                numOfGroup = 5;
                teachnerInCharge = "Ms. Lela";
            } else {
                location = "Six Flags";
                numOfGroup = 8;
                teachnerInCharge = "Mr. Watt";
            }
            info = "grade - " + grade + "\n" +
                    "location - " + location + "\n" +
                    "number of groups - " + numOfGroup + "\n" +
                    "teacher in charge - " + teachnerInCharge;
        } else {
            info = "Invalid Grade number";
        }

        System.out.println(info);
    }
}
