package CustomMethods.studentTask;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
        //*** instance variables are called by obj(student1) name
        student1.name = "Sabir";
        //System.out.println(student1.name);

        Student student2 = new Student();
        student2.name = "Muhtar";
        student2.studentAge = 29;
        student2.stduentId = 123456;

        //*** static variables are call by class name(Student)
        Student.schoolName = "Cybertek school";
        Student.cityOfSchool = "Virginia";

        System.out.println(student1);
        System.out.println(student2);

        Student.cityOfSchool = "Chicago";

        System.out.println("****\n after changing city name (static) ***\n");
        System.out.println(student1);
        System.out.println(student2);
    }
}
