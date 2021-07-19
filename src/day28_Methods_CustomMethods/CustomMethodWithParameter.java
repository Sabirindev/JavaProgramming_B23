package day28_Methods_CustomMethods;

public class CustomMethodWithParameter {
    public static void main(String[] args) {
        eligible(30);

    }
    static void eligible(int age){
        if (age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }
}
