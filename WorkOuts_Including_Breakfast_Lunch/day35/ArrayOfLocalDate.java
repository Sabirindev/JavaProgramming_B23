package day35;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class ArrayOfLocalDate {
    public static void main(String[] args) {
        /*
        DateTimeFormatter DF= DateTimeFormatter.ofPattern("MMMM/dd, EEEE");
        LocalDate[] arraysDate=new LocalDate[10];
        String[] array=new String[10];
        LocalDate now= LocalDate.now();
        for (int i = 0; i < arraysDate.length; i++) {
            arraysDate[i]=now.plusDays(i+1);
            array[i]=arraysDate[i].format(DF);
        }
        System.out.println(Arrays.toString(array));

         */
        LocalDate[] dates = new LocalDate[10];

        for (int i = 0; i < dates.length; i++) {
            dates[i] = LocalDate.now().plusDays(i);
        }
        System.out.println(Arrays.toString(dates));

        //DateTimeFormatter DF = DateTimeFormatter.ofPattern("MMM/dd EEEE");

        for (LocalDate each : dates) {
            System.out.println(each.format(DateTimeFormatter.ofPattern("MMMM/dd, EEEE")));
        }

    }

}
/*
1. create an array of LocalDate and has the next 10 day's dates,
use for each loop to print each Date in the following formar:
                MonthName/Day, Day Name

                ex:
                    November/25, Wednesday
 */
