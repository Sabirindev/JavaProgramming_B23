package day28_Methods_CustomMethods;

public class CustomMethodWithParameter {
    public static void main(String[] args) {

//        char ch = ' ';
//        char ch1 = 'a';
//        System.out.println(ch);//space
//        System.out.println(ch1);//a
//
//        char ch2 = 65;
//        System.out.println(ch2);
//
//        int b = 'b';
//        System.out.println(b);

        //eligible(50);

        eligible(20);

    }

    //custome methods
     static void eligible(int age){ // void or all data type

        if (age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
        //return;
        //return; keyword is used to exit the current method.

        //break keyword is used to exit the current loop


        //return "Sabir";5 2.5 is used to retrun result in same data typed

    }
}
