package day04_Variables;

public class PrimitivesContinue {
    /*
    char: for single character only
    boolean;
     */

    public static void main(String[] args) {
        //#

        char ch1 = '#';
        char ch2 = 35;
        System.out.println("ch1 = "+ ch1+ "\n" +"ch2 = "+ ch2);

        //Z

        char ch3 = 'Z';
        char ch4 = 90;
        System.out.println("ch3 = "+ ch3+"\n"+"ch4 = "+ ch4);

        System.out.println("-------------------------------------------------");

        char ch5 = 15000;
        System.out.println("ch5 = "+ch5);

        char ch6 = 13013;
        System.out.println("ch6 = "+ch6);

        char ch7 = 15 + 45;
        System.out.println(ch7);


        System.out.println("******************************************************");

        //10>9

        boolean r1 = 10>9;
        System.out.println("r1 = "+r1);

        boolean r2 = true;
        boolean r3 = false;

        System.out.println("r2 = "+r2);
        System.out.println("r3 = "+r3);

        boolean isFullTime = false;
        boolean isMarried = false;


        System.out.println(isFullTime+", "+isMarried);

        boolean isPandemic = true;

        boolean r4 = "Java" == "Pyton"; // equal operator: ==
        System.out.println("r4 = "+ r4);

    }
}
