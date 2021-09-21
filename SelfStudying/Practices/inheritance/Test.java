package Practices.inheritance;

class A {
    public A() { //constructor A
        System.out.println("A");
    }
    public A(int a){
        System.out.println("Contructor with int parameter");
    }
}

class B extends A {
        public B() { //constructor B
        super();// it calls default contructor(publicA()) from superclass(class A)
               // thta is why contructor with parameter publi A(int a) is not run , bc it is not called,
             // it is only called like this super(5);
        System.out.println("B");
    }
}

public class Test extends B {
    public Test() {
        System.out.print("C ");
    }

    public static void main(String[] args) {
        B obj = new B();


    }
}
