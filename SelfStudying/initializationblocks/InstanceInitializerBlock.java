package initializationblocks;

public class InstanceInitializerBlock {
//    public InstanceInitializerBlock() {
//        System.out.println("super class Constructor");// 1
//    }
}

    class B2 extends InstanceInitializerBlock{
        B2(){
            //super();
            System.out.println("child class constructor invoked"); // 3
        }

        {System.out.println("instance initializer block is invoked");} // 2

        public static void main(String args[]){
            B2 b=new B2();
        }
    }


