package day44_RECAP_ClassObject_InstanceStatic.personTask;

import java.time.LocalDate;


public class PersonObjects {
    public static void main(String[] args) {
        Person person1 = new Person("Sabir",'m', LocalDate.of(1986,02,13),"Azerbaijan","Azerbaijani Turkish");
        System.out.println(person1);
    }
}
