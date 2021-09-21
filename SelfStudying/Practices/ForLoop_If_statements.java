package Practices;

public class ForLoop_If_statements {
    public static void main(String[] args) {

        int result = 0;
        for (int i = 0; i < 5; i++) {// i: 0, 1, 2, 3, 4, 5=> when i = 5 for loop stops
            if (i == 3) {
                result += 10;   //result : x, x, x, 13, x
            } else {
                // i: 0, 1 , 2, 3, 4;
                result += i;    //result : 0, 1, 3, x, 17 => result
            }
        }
        System.out.println(result); // after for loop stopping, println method prints "result's value" 17

        String s1 = "Sabir";
        System.out.println(s1);

        System.out.println("**************************");

        s1.substring(0,2);
        System.out.println(s1); //Sabir
        System.out.println(s1); //Sabir
        s1  = s1; //Sabir
        s1  = s1.substring(0,2);
        System.out.println(s1);//Sa
    }
}
