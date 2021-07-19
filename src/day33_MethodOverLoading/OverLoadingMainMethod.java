package day33_MethodOverLoading;

public class OverLoadingMainMethod {
    public static void main(char[] args) {
        System.out.println("char");

    }

    public static void main(String[] args) {
        System.out.println("String");
        System.out.println("All method in JAva CAN BE OVERLOADED");
    }

    public static void main(int[] args) {
        System.out.println("int");

    }

}
