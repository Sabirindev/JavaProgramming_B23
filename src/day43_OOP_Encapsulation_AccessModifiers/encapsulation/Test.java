package day43_OOP_Encapsulation_AccessModifiers.encapsulation;

public class Test {
    public static void main(String[] args) {
        EncapsulationIntro obj = new EncapsulationIntro();

        /*System.out.println(obj.userName);
        System.out.println(obj.password);

        obj.userName = "AAA";
        obj.password = "000";

        System.out.println(obj.userName);
        System.out.println(obj.password);

         */

        System.out.println(obj.getUserName());
        System.out.println(obj.getPassword());

        obj.setUserName("Sabir");
        obj.setPassword("asdfghj");

        System.out.println(obj.getUserName());
        System.out.println(obj.getPassword());

    }
}
