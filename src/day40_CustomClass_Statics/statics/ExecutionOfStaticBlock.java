package day40_CustomClass_Statics.statics;

public class ExecutionOfStaticBlock {
    static { // static bock is the first to run
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }

    public static void method1(){
        System.out.println("method1");
    }
}
