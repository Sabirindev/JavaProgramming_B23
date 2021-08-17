package day43_OOP_Encapsulation_AccessModifiers.accessModifier;

public class AccessModifiers {
    public static int publicVariable = 100;
    //protected static int protectedVariable =1000;
    static int defaultVariable = 300; // ACC mod: is default
    private static int privateVariable = 400;

    public static void main(String[] args) {
        System.out.println(publicVariable);// public access modifier is reachable within same class
        System.out.println(defaultVariable);// default access modifier is reachable within same class
        System.out.println(privateVariable);// private access modifier is reachable within same class
    }
}
