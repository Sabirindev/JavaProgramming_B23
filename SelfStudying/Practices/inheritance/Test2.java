package Practices.inheritance;

class Test1{

    protected void method(){
        System.out.println("method protected");
    }

    //private void method(int a){ //private method can not be overriden
        protected void method(int a){
        System.out.println("method with //private ");
    }
}

public class Test2 extends Test1{
   @Override
    public void method(int a) {
        System.out.println("aaaa");
    }


    public static void main(String[] args) {
        Test2 obj = new Test2();
        obj.method();
        obj.method(9);

        Test1 obj1 = new Test1();
        obj1.method(5);
    }
}
