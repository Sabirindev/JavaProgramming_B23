package day48_RECAP_OOP_Encapsulation_Inheritance.personTask;

import java.time.LocalDate;

public final class Teacher extends Employee {
    public Teacher(String name, char gender, LocalDate dOB, int employeeId, String jobTitle, double salary) {
        super(name, gender,dOB, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+" is teaching");
    }

    @Override
    public void attendMeeting() {
        System.out.println(getJobTitle()+" "+getName()+" is attending instructors meeting");
    }
}
/*

 */
