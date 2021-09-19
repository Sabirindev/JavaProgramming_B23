package day52_OOP_Abstraction_Interface;

abstract class  InterfaceIntro {

    public static void a(){ //regular method
        System.out.println("Sabir");
    }
    abstract void b(); //abstract method
}

class MainClass extends InterfaceIntro{
    //static InterfaceIntro interface1;

    void b(){
        System.out.println("Abstarct class is overriden from super class InterfaceIntro");    }

    public static void main(String[] args) {

       MainClass obj = new MainClass();
       obj.b();
       InterfaceIntro.a();
    }


}
