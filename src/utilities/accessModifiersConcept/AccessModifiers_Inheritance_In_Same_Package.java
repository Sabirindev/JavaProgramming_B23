package utilities.accessModifiersConcept;

public class AccessModifiers_Inheritance_In_Same_Package extends Data2 {

    //same package: public, prodected, default are visible

    public void method(){

        System.out.println(publicVariable);
        System.out.println(protectedVariable);
        System.out.println(defaultVariable);
        //System.out.println(privateVariable);// private is not visible from out of class

        publicMethod();
        protectedMethod();
        defaultMethod();
        //  privateMethod(); //private is not visible outside the class

    }



}
