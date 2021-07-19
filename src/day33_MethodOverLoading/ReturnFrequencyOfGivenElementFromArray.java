package day33_MethodOverLoading;

public class ReturnFrequencyOfGivenElementFromArray {
    public static void main(String[] args) {

        System.out.println("*********** int ************");
        int[] array ={1,1,1,1,1,2,2,1,1,1,1};
        System.out.println(frequency(array, 1));

        System.out.println("********** double **********");

        double[] array1 = {1.5,2.6,1.5,2.8,1.5,5.9,6.8,1.5};
        System.out.println(frequency(array1,1.5));

        System.out.println("************ String *****************");

        String[] array3 = {"Sabir","Muhtar","Sabir","Vitali","Abbos","Atilla","Kseniia","Sabir"};
        System.out.println(frequency(array3,"Sabir"));

        System.out.println("************ char *****************");

        char[] array4 = {'A','B','C','A','A','D'};
        System.out.println(frequency(array4,'A'));
        

    }

    //return the frequency of given int number in 'int' array
    public static int frequency(int[] array, int number){
        int count = 0;
        for (int each : array) {
            if (each == number){
                count++;
            }
        }
        return count;
    }

    //return the frequency of given double number in 'double' array
    public static int frequency(double[] array, double number){
        int count = 0;
        for (double each : array) {
            if (each == number){
                count++;
            }
        }
        return count;
    }

    //return the frequency of given string in 'String' array
    public static int frequency(String[] array, String str){
        int count = 0;
        for (String each : array) {
            if (each.equals(str)){
                count++;
            }
        }
        return count;
    }

    //return the frequency of given char in 'char' array
    public static int frequency(char[] array, char ch){
        int count = 0;
        for (char each : array) {
            if (each == ch){
                count++;
            }
        }
        return count;
    }
}
/*
Task3:
        1. create method that accepts one integer array and one integer number and returns the frequency of the number
                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5

        2. create method that accepts one double array and one double number and returns the frequency of the number


        3. create method that accepts one String array and one String and returns the frequency of the String
                Ex:
                    String[] array = {"Apple", "Apple", "Apple", "Orange"}

                    frequency(array, "Orange") ==> 1

        4. create method that accepts one char array and a char and returns the frequency of the char
 */
