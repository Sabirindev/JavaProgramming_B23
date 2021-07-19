package day22_do_While_Recap;

public class sumOfEvenNums0To10_doWhile {
    public static void main(String[] args) {
       int sum = 0;
       int i = 0;
        do {

            sum += i;
            i +=2;
        }while (i<=10);
        System.out.println(sum);
    }
}
