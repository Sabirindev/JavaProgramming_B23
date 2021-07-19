package day07;

public class SwipVariablese {
    /*
    write a program that can swipe two variables' value by using a temporary variable
    ex:
        if a= 10, b=15

    output:
        a = 15
        b = 10
     */
    public static void main(String[] args) {
        int a = 10, b = 15, c;

        c = a; a = b; b = c;

        System.out.println("a = "+ a +"\n"+"b = "+ b);
    }
}
