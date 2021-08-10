package day42_CustomClass_Constructor_this_GarbageCollection.warmTask;

public class CybertekStudentObjects {
    public static void main(String[] args) {
        CybertekStudent student1 = new CybertekStudent("Sabir",35,'M');
        CybertekStudent student2 = new CybertekStudent("Vitali",30,'M');

        System.out.println(student1);
        System.out.println(student2);

        student1.attendClass();
        student2.replit();


    }
}
