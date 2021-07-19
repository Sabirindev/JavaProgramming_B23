package day09_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {
        int number = -82;

        if (number > 0){
            System.out.println(number+" is positive number");
        }else if (number<0){
            System.out.println(number+" is negative number");
        }else{
            System.out.println(number+" is zero");
        }

    }
}
