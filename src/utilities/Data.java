package utilities;

import day43_OOP_Encapsulation_AccessModifiers.accessModifier.AccessModifiers;

public class Data {

    //****************** instance variable and methods **********************
    public String str1 = "instance variable1", str2 = "instance variable2";
    public void method1() {
    }
    public void method2() {
    }




    //****************** static variable and methods **********************
    public static String str3 = "static variable3", str4 = "static variable4", str5 = " static variable5";

    public static void method3() {
        System.out.println(" static method3 ");
    }

    public static void method4() {
        System.out.println(" static method4 ");
    }

    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicVariable);//public access modifier is reachable outside the package
        //System.out.println(AccessModifiers.deaultVariable);// default access modifier is NOT reachable outside the package
        //System.out.println(AccessModifiers.privateVariable);// private access modifier is NOT reachable outside the package

    }
}
