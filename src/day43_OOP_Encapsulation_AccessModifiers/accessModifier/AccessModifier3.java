package day43_OOP_Encapsulation_AccessModifiers.accessModifier;

public class AccessModifier3 {

    public static int a = 10;
    static int b = 20;
    private static int c = 30;
}

    class Test3{
        public static void main(String[] args) {
            System.out.println(AccessModifier3.a);
            System.out.println(AccessModifier3.b);
        }

    }

