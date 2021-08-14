package day29_ReturnMethods;

public class returnMaxMinNumberFromArray {
    public static void main(String[] args) {
        // find max number between 10 & 20, then multiply it by 2


        int[] numbers = {10, 5, 0, -1, 20, 8, 7};
        int max = numbers[0];
        int min = numbers[0];

        for (int each : numbers) {
            max = maxMethod(each, max);
            min = minMethod(each, min);
        }


        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("******************************************************");

        int[] nums = {200, 300, 500, 5, -1, 0, -100, 1000, 2000};
        int minimumNumber = minNumberFormIntArray(nums);
        int maximumNumber = maxNumberFormIntArray(nums);

        System.out.println("minimumNumber = " + minimumNumber);
        System.out.println("maximumNumber = " + maximumNumber);

        System.out.println("******************************************************");

        System.out.println("minumum number = "+minNumberFormIntArray(nums));
        System.out.println("maximum number = "+maxNumberFormIntArray(nums));
    }

    //Custome Return Method

    public static int maxMethod(int a, int b) {
       /*
        int max = 0;
        if(a > b){
            max = a;
        }else{
            max = b;
        }
       return max;
        */
        return (a > b || a == b) ? a : b;
    }

    public static int minMethod(int a, int b) {

        return (a < b || a == b) ? a : b;
    }


    public static int maxNumberFormIntArray(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            max = maxMethod(max, number);
        }

        return max;
    }

    public static int minNumberFormIntArray(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            min = minMethod(min, number);
        }

        return min;
    }



    /*
    create a return method that can return the maximum number from the array
    create a return method that can return the minimum number from the array
     */
}

