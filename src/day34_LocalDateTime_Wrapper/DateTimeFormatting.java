package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
    public static void main(String[] args) {
        DateTimeFormatter DF = DateTimeFormatter.ofPattern("MM/dd/YYYY EEEE");

        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println(today.format(DF));

        System.out.println("**********************************************");
        DateTimeFormatter TF = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime currentTime = LocalTime.now();

        //LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        System.out.println(currentTime.format(TF));

        LocalTime time1 = LocalTime.of(17,25);
        System.out.println(time1);

        System.out.println(time1.format(TF));

        System.out.println("*********************************************");

        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("MMMM/dd/YYYY EEEE hh:mm a");

        LocalDateTime a = LocalDateTime.now();

        System.out.println(a);
        System.out.println(a.format(DTF));

        System.out.println("*********************************************");
        //Tuesday 1:00 ppm, Nov/24/2020
        DateTimeFormatter format1 =  DateTimeFormatter.ofPattern("EEEE,hh:mm a, MMM/dd/YYYY");

        LocalDateTime time2 = LocalDateTime.of(2020,11,24,13,0);
        System.out.println(time2);
        System.out.println(time2.format(format1));

        System.out.println("*********************************************");
        //what day is 2022-01-01
        String result1 = LocalDate.of(2022,1,1).format(DateTimeFormatter.ofPattern("EEEE"));
        System.out.println(result1);

        System.out.println("*********************************************");

        System.out.println(nameOfTheDay(2025,5,28));


    }

    public static String nameOfTheDay(int year,int month,int day){
        String result = LocalDate.of(year, month,day).format(DateTimeFormatter.ofPattern("EEEE"));
        return result;
    }

}
