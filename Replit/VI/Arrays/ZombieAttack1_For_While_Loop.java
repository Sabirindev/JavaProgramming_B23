package VI.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack1_For_While_Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int day = 0, sum = 0;
        // if inhabitants[] = {0,0,0,0,0,0,0,0} >>> then sum = 0
        for (int j = 0; j < inhabitants.length; j++) {
            sum = sum + inhabitants[j]; // sum is total number of population in 8 cities.
        }
        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
        //if sum !=0 >>> then at elast, one of the element of array inhabitants[] is different then '0'
        // that is why while() loop starts to execute the statements inside its body
        while (sum != 0) {
            // for making it(each element) lose half of its population
            for (int i = 0; i < inhabitants.length; i++) {
                inhabitants[i] = inhabitants[i] / 2;
                // after every city loses half of its population,
                // total number of population(sum) should be calculated from scratch.
                sum = 0;
                // calculating the number of population
                for (int j = 0; j < inhabitants.length; j++) {
                    sum = sum + inhabitants[j];
                }

                //if sum is zero, then no need to check other element of array,
                // then break is executed to exit outter for loop
                //so this help your code runs faster, i guess
                if (sum == 0) {
                    break;
                }
            }
            day++;
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
        }
        System.out.println("---- EXTINCT ----");
        input.close();
    }
}
/*
An array **inhabitants** represents cities and their respective populations.
For example, the following arrays shows 8 cities and their respective populations: [3, 6, 0, 4, 3, 2, 7, 1]

Some cities have a population of 0 due to a pandemic zombie disease that is wiping out the human lives.
After each day, every city will lose half of its population.

Write a program to loop though each city population and make it lose half of its population
**until all cities have no humans left**. Make updates to each element in the array
And print the array like below for each day:

Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----

Write the program in a way that it will handle any number of people in cities, above was just an example

Hint:

Below expression will print array in this format:

System.out.println(Arrays.toString(inhabitants)));

[3, 6, 0, 4, 3, 2, 7, 1]
 */
