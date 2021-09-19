package day48_RECAP_OOP_Encapsulation_Inheritance.personTask;

import java.time.LocalDate;

public class PersonObjects {
    public static void main(String[] args) {

        System.out.println("******************** Student ************************");
        Student student =new Student("Sabir",'M',LocalDate.of(1986,02,13),13,"CyberTek");
        System.out.println(student);
        student.eat("Chicken");
        student.sleep();
        student.study();
        student.drink("Green tea");


        System.out.println("\n******************** Tester ****************************");
        Tester tester = new Tester("Vitalii",'M',LocalDate.of(1986,05,15),14,"SDET",155000);
        System.out.println(tester);
        tester.eat("Steak");
        tester.drink("coffee");
        tester.sleep();

        System.out.println("\n****************** Developer ******************************");
        Developer developer = new Developer("Abbos",'M',LocalDate.of(1990,06,16),15,"Software Developer",165000);
        System.out.println(developer);
        developer.work();
        developer.attendMeeting();
        developer.eat("Manti");
        developer.sleep();

        System.out.println("\n******************* Teacher ******************************");
        Teacher teacher = new Teacher("Elif",'F',LocalDate.of(1986,03,19),16,"Java Instructor",135000);
        System.out.println(teacher);
        teacher.eat("Dolma");
        teacher.drink("Tea");
        teacher.sleep();
        teacher.work();
        teacher.attendMeeting();



    }
}
