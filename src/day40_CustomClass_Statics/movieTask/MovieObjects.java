package day40_CustomClass_Statics.movieTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class MovieObjects {

    public static void main(String[] args) {

        Movie movie1 = new Movie();
        movie1.setInfo("Journey to SDET: Cybertek Batch 23",
                "USA", " Adventure, Comedy", "Kuzzat Altay",
                LocalDate.of(2021,5,17)
        );
        String[] casts = {"mehmet", "Akbar"}; // casts Array is created with 2 size ( mehmet and Akbar)
        movie1.addCast("Asiya"); // "Asiya" is written on 'o' index of casts ArrayList
        movie1.addCast(casts); // casts array( mehmet, akbar) is added to casts ArrayList

        System.out.println(Arrays.toString(casts));//[mehmet, Akbar] casts Array is printed out
        System.out.println(movie1.casts); //[Asiya, mehmet, Akbar], casts ArrayList is printed out

        ArrayList<String> students = new ArrayList<>();// student Arraylistis created
        students.addAll(Arrays.asList("Dilem", "Ahmet", "Tugba", "Feruza", "Fabricio")); //added elements to student ArrayList

        movie1.addCast(students);//studetnts ArrayList is added to casts ArrayList

        System.out.println(movie1);



    }
}
/*
      create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cybertek Batch 23
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: May/17/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Mehmet, Akbar and 5 more students from your group

            print the full info of the movie
 */

