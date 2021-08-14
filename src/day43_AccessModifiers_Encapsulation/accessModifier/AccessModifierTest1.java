package day43_AccessModifiers_Encapsulation.accessModifier;

public class AccessModifierTest1 {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicVariable);//public access modifier is reachable within same package
        System.out.println(AccessModifiers.defaultVariable);//default access modifier is reachable within same package
        //System.out.println(AccessModifiers.privateVariable);////private access modifier is NOT reachable within same package
    }
}
