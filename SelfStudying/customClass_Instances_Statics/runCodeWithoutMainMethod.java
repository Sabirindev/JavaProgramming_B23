package customClass_Instances_Statics;

public class runCodeWithoutMainMethod {

    public static String name;
    public static int numberOfStudent;

    static {
        name = "Cybertek School";
        System.out.println(name);
        numberOfStudent = 180;
        System.out.println("number of student: "+ numberOfStudent);

    }

    public static void main(String[] args) {

    }
}
