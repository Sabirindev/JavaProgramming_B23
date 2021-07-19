package day29;

public class CM_printMaxNumber {
    public static void main(String[] args) {
        printMAxNumber(10,10);
    }
    public static void printMAxNumber(int num1, int num2){
        if (num1>num2){
            System.out.println(num1+" is maximum");
        }else if (num1<num2){
            System.out.println(num2+" is maximum");
        }else {
            System.out.println(num1+" and "+num2+" are equal");
        }
    }
}
/*
4. create a function that can print out the maximum number between two numbers
 */
