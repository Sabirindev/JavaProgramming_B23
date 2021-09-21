package oop.inheritance;

class A{

    private int n1 = 100;
    int n2 = 200;
    protected int n3 = 300;
    public int n4 = 400;

    private void method1(){
        System.out.println("method1");
    }

    void method2(){
        System.out.println("method2");
    }
    protected void method3(){
        System.out.println("method3");
    }

    public void method4(){
        System.out.println("method4");
    }

}

public class Inheritance1 extends A{

    public static void main(String[] args) {
        Inheritance1 inheritance1 = new Inheritance1();
        //inheritance1 obj will get everything from super class(A class)
        // except its private fileds..
        System.out.println("inheritance1.n2 = " + inheritance1.n2);
    }

}

class B extends A{


}

class C extends Inheritance1{

}
