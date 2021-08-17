package day45_OOP_Inheritance.employeeTask;

public class Tester extends Employee{

    public Tester(String name, char gender, int age, long id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }

    public void testing(){
        System.out.println(jobTitle+" "+name+" is testing");
    }
}
