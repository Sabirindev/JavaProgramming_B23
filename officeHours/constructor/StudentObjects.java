package constructor;

public class StudentObjects {
    public static void main(String[] args) {
        Student student=new Student("Dilem");
        System.out.println(student);

        Student student1=new Student("Yuliang",25);
        System.out.println("student1 = " + student1);


        Student student2=new Student("Ivana",25,23);
        System.out.println("student2 = " + student2);

    }
}
