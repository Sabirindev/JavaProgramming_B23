package day41_CustomClass_Constructor;

public class StaticPractice {

    public int insA = 20;
    public int insB = 200;

    static class Test1{
        static int b;
    }

    public static int a = 100;

    public void method2(){
        System.out.println(" *********************** instance method2 ***************************");
        System.out.println(insB);
    }

    public static void method1(){
        System.out.println("************************ static method1 *********************************");
        StaticPractice obj1 = new StaticPractice();
        System.out.println("instance varibale is called through class obje from static custom method: "+obj1.insA);
        System.out.println("static a = "+ a);

    }



    static {
        System.out.println("static block");

    }

    public static void main(String[] args) {
        method1();

        StaticPractice obj1 = new StaticPractice();
        obj1.method2();

    }
}
