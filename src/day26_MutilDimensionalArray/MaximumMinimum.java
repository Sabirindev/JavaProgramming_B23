package day26_MutilDimensionalArray;

public class MaximumMinimum {
    public static void main(String[] args) {
        int[][] numbers = {{10,20,30},{40,50,60,70,80}};

        int max = numbers[0][0];
        int min = numbers[0][0];
        int sum = 0;
        int count =0;

        for (int[] number : numbers) { // number: each of the single D arrays in 2D array
            for (int eachNumber : number) {//eachNumber: each of the elements in 1D array
                count++;
                sum += eachNumber;
                if (eachNumber > max){
                    max = eachNumber;
                }
                if (eachNumber < min){
                    min = eachNumber;
                }
            }
        }
        System.out.println("Minimum = "+min);
        System.out.println("Maximum = "+max);
        System.out.println("Sum of eachNumber of Array = "+sum);
        System.out.println("Average of numbers of Arrays = "+ (double)(sum/count));
    }
}
/*
write a program that can find the maximum & minimum number from any two dimensional array
                {{10,20,30},{40,50,60,70,80}};
                max: 80
                min: 10

 */
