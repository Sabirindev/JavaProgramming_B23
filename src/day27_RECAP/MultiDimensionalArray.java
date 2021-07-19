package day27_RECAP;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        //                    0          1        2        3
        String scrum1[] = {"Komiljon", "Yuliang", "Merve", "Nadima"};
        //                    0          1
        String scrum2[] = {"Sabir", "Tamara"};
        //                   0         1      2
        String scrum3[] = {"Tugba", "Hilal", "Dilem"};

        String scrumTeams[][] = {scrum1, scrum2, scrum3}; //length: 3
        // index                   0      1      2

        System.out.println(Arrays.toString(scrumTeams[0]));//["Komiljon","Yuliang","Merve","Nadima"]

        System.out.println(scrumTeams[1][1]);//Tamara

        System.out.println("*******************************************");

        for (String[] eachScrum : scrumTeams) {
            //System.out.println(Arrays.toString(eachScrum));//print out all 1D arrays(scrum1, scrum2,scrum3) 's elements
            for (String eachMember : eachScrum) {
                System.out.print(eachMember + " ");
            }
        }

        System.out.println("\n*******************************************");

        for (int i = 0; i < scrumTeams.length; i++) {
            for (int j = 0; j < scrumTeams[i].length; j++) {
                System.out.print(scrumTeams[i][j] + " ");
            }
        }

        System.out.println("\n*********** Reversing array's element without creating new array *****************");

        int[] numbers = {1, 2, 3, 4, 5}; //{5,4,3,2,1}
        System.out.println(Arrays.toString(numbers));

        int temp = numbers[0]; //1

        numbers[0] = numbers[4]; //[5,2,3,4,5]

        numbers[4] = temp; // 1
        temp = numbers[1]; // 2
        numbers[1]= numbers[3];//4 [5,4,3,4,1]
        numbers[3]=temp;//2 5,4,3,2,1]

        System.out.println(Arrays.toString(numbers));

    }
}
