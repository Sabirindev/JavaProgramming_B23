package day10_If_Nested_If_Ternary_Statements;

public class DaysInWeek_Nested_If {

    public static void main(String[] args) {
        int numberOfDay =1;
        String day = "";

        if(numberOfDay>0 && numberOfDay <=7) {  // nested if =Pre-condition

            if (numberOfDay == 1) {
                day = "Monday";
            } else if (numberOfDay == 2) {
                day = "Thuesday";
            } else if (numberOfDay == 3) {
                day = "Wednesday";
            } else if (numberOfDay == 4) {
                day = "Thursday";
            } else if (numberOfDay == 5) {
                day = "Friday";
            } else if (numberOfDay == 6) {
                day = "Saturday";
            } else {
                day = "Sunday";
            }
        }


        else {
            day = "There is no such a day";
        }

        System.out.println(day);
    }
}
