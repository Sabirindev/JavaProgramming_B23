package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Practicing1 {
    public static void main(String[] args) {
        LocalDate day1 = LocalDate.of(1986,02,13);
        LocalTime time1 = LocalTime.of(17,35);
        LocalDateTime dateTime = LocalDateTime.of(day1,time1);

        System.out.println(dateTime);


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM/d/YYY");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println(time1.format(dtf1));

        System.out.println(dateTime.format(dtf));


        System.out.println("*******************************************************");
        System.out.println(day1.getYear());
        System.out.println(day1.getDayOfWeek());
        System.out.println(day1.plusDays(2));

        Practicing1();

        String str = "sabir";
        char z = 'a';
        System.out.println(str.contains("" + z));
        String b1 = "a";
        System.out.println();
        boolean check = true;

        check = b1.equals("a")? check: false;
        System.out.println(check);
        System.out.println(5/2);

        System.out.println("************------------------------**********************");

        LocalDate date = LocalDate.of(2018,1,18);
        System.out.println(date);
        LocalTime time = LocalTime.of(14,42);
        System.out.println(time);
        LocalDateTime datetime = LocalDateTime.of(date,time);

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy | hh:mm");
//        date= date.plusDays(1).minusYears(2).minusWeeks(1);
        System.out.println(datetime.format(format1));
        System.out.println("*********************************");
       System.out.println(datetime);
        System.out.println("************------------------------**********************");


    }
    public static void Practicing1(){
        System.out.println("method Practicing1");
    }

}
