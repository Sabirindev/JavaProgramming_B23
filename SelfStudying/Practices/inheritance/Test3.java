package Practices.inheritance;

class X {
    public X() {
        System.out.print(" X ");
        System.out.println("default constructor from class X");
    }
    public X(int a){
        System.out.println("Constructo with parameter int a from class X");
    }
}
class Y extends X{
    public Y() {
        super(6);
    }
}


public class Test3 {
    public static void main(String[] args) {
        Y obj = new Y();
    }
}
