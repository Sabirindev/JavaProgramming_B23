package day40_CustomClass_Statics.statics;

public class Test {
    public static void main(String[] args) {

        System.out.println( StaticBlocks.list );
       // StaticBlocks.list.set(0, "Z");


        System.out.println( StaticBlocks.list );

        System.out.println("---------------------------------------");

        ExecutionOfStaticBlock.method1();
        ExecutionOfStaticBlock.method1();
        ExecutionOfStaticBlock.method1();
    }
}
