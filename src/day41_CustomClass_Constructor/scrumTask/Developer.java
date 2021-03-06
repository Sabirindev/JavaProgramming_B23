package day41_CustomClass_Constructor.scrumTask;

public class Developer {
    public String name;
    public String jobTitle;
    public char gender;
    public int employeeID;
    public double salary;

    public static boolean isEmployeed = true;
    public static boolean hatesTester;

    static {
        isEmployeed = true;
        hatesTester = true;
    }

    public Developer(String name, char gender, String jobTitle, double salary, int employeeID) {
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", employeeID=" + employeeID +
                ", salary= $" + salary +
                '}';
    }

    public void coding(){
        System.out.println(name+" is writing code");
    }
    public void fixingBugs(){
        System.out.println(name+" is fixing bug");
    }
}
/*
create a class called Developer
          Attributes:
            name, employeeID, JobTitle, Salary, Gender
          Actions:
            setInfo(), coding(), unitTesting(), fixingBug(), toString()
 */
