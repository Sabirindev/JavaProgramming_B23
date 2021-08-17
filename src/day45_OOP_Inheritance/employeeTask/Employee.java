package day45_OOP_Inheritance.employeeTask;

public class Employee extends Person{

    public long id;
    public String jobTitle;
    public double salary;

    public Employee(String name, char gender, int age, long id, String jobTitle, double salary) {
        super(name, gender, age);
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void work(){
        System.out.println(name+"is working");
    }
    public void attendmeeting(){
        System.out.println(name+" is in the meeting");
    }

    @Override
    public String toString() {
        return "Employee{" +
                " id =" + id +
                ", jobTitle ='" + jobTitle + '\'' +
                ", salary =$" + salary +
                ", name='" + name + '\'' +
                ", gender =" + gender +
                ", age =" + age +
                '}';
    }
}
