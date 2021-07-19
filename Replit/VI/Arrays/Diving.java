package VI.Arrays;

import java.util.Scanner;

public class Diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float score[] = new float[7];

        float totalScores = 0f;

        for (int i = 0; i < score.length; i++) {
            System.out.println("Enter score for judge " +(i+1)+":");
            score[i] = input.nextFloat();
            totalScores += score[i];
        }
        float highest = score[0],
                lowest = score[0];

        for (int i = 0; i < score.length; i++) {
            if (score[i] > highest){
                highest = score[i];
            }
            if (score[i]<lowest){
                lowest = score[i];
            }
        }

        System.out.println("highest = "+highest);
        System.out.println("lowest = "+lowest);

        System.out.println("Enter difficulty:");
        float difficulty = input.nextFloat();
        if(difficulty>=1.2 && difficulty <= 3.8){
            totalScores = ((totalScores - (highest+lowest))*difficulty*0.6f);
        }
        System.out.println("Total: "+totalScores);
        input.close();
    }
}
/*
In the sport of diving, seven judges award a score between 0 and 10, where each score may be a floating-point value.
The highest and lowest scores are thrown out, and the remaining scores are added together.
The sum is then multiplied by the degree of difficulty for that dive.
The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6 to determine the divers score.

Flow:

Accept the 7 scores from the judges
Accept the difficulty number
Display the final score

Enter score for judge 1:
1
Enter score for judge 2:
5
Enter score for judge 3:
5
Enter score for judge 4:
5
Enter score for judge 5:
5
Enter score for judge 6:
8
Enter score for judge 7:
9
Enter difficulty:
2.1
Total: 35.28
 */
