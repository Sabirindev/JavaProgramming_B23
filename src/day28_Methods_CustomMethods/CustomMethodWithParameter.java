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

        eligible('b');

    }

    //custome methods
     static void eligible(int age){

        if (age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }

    }
}
