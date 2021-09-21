package CustomMethods.studentTask;

public class Student {
    //**** instance variables ****
    public String name;
    public int stduentId;
    public int studentAge;

    //**** static variables ****
    public static String schoolName;
    public static String cityOfSchool;


    // toString() method is instance method and called impicitly by compiler
    public String toString() {
        return "Student{" +
                "name = '" + name + '\'' +
                ", stduentId = " + stduentId +
                ", studentAge = " + studentAge +
                ", school name = " + schoolName +
                ", city name = "+ cityOfSchool +
                '}';
    }
}
