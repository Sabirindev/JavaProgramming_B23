package oop.polymorphism;
class A{
    public void methodA(){
        System.out.println("Method A");
    }
}
class B extends A{
     public void methodA(){ // methodA() is overridden in child class (class B) from superclass (class A)
                           // That is why methodA() in class B is executed
        System.out.println("Method C");
    }

    public void methodB(){
        System.out.println("Method B");
    }
}
public class Test {
    public static void main(String[] args) {
        A obj = new B();
        obj.methodA();
    }
}
