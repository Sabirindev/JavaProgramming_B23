package day41_CustomClass_Constructor.scrumTask;

public class Tester {
    public String name;
    public int employeeID;
    public char gender;
    public String jobTitle;
    public double salary;



    public static boolean isCybertekStudent;
    public static boolean isEmployeed;

    static {
        isCybertekStudent = true;
        isEmployeed = true;
    }

    public Tester(String name, char gender, String jobTitle, int employeeID, double salary) {
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;

    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name+ " is smoke stestingz");
    }
}
/*
 create a class called Tester
        Attributes:
            name, employeeID, JobTitle, Salary, gender
        Actions:
           setInfo(), smokeTesting(),  creatingTicket(), dailyStandUp() toString()


 */
