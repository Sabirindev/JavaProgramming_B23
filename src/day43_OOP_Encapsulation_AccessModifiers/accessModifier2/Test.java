package day43_OOP_Encapsulation_AccessModifiers.accessModifier2;

import day43_OOP_Encapsulation_AccessModifiers.accessModifier.AccessModifiers;

public class Test {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicVariable);//public access modifier is reachable outside the package
        //System.out.println(AccessModifiers.deaultVariable);// default access modifier is NOT reachable outside the package
        //System.out.println(AccessModifiers.privateVariable);// private access modifier is NOT reachable outside the package


    }
}
