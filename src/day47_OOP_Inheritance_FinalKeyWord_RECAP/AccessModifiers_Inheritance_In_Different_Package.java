package day47_OOP_Inheritance_FinalKeyWord_RECAP;

import utilities.accessModifiersConcept.Data2;

public class AccessModifiers_Inheritance_In_Different_Package extends Data2 {

    public void method(){

        System.out.println(publicVariable);
        System.out.println(protectedVariable);// protected can be visible outside package if there is a subclass
        //System.out.println(defaultVariable);// default is only visible within the same package
        //System.out.println(privateVariable);// private is only visible within the same class


        publicMethod();
        protectedMethod();
       // defaultMethod();//default is only visible within the smae package
        //privateMethod();//private is not visible outside the class

    }
}
