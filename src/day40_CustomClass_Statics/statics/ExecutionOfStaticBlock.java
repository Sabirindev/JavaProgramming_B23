package day40_CustomClass_Statics.statics;

public class ExecutionOfStaticBlock {

    public static int a = 10; // static field (variable) // runs first

    static {                        // static bock is the first to run
         a = 20;
//        System.out.println(a);
    }




    public static void main(String[] args) {
        System.out.println("Main method");
        a = 40;
        a = 50;
        System.out.println(a);
    }

    public static void method1(){
        System.out.println("method1");
    }
}
