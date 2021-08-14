package constructor;

public class TeacherObjects {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        // no args
        Teacher teacher1=new Teacher("Abbos");
        // name param
        Teacher teacher2=new Teacher(34);
        // age param
        Teacher teacher3=new Teacher("Abbos",34);
        // age&name OR All Arg Constr


    }
}
