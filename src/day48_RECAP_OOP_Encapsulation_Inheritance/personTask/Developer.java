package day48_RECAP_OOP_Encapsulation_Inheritance.personTask;

import java.time.LocalDate;

public final class Developer extends Employee{

    public Developer(String name, char gender,LocalDate dOB, int employeeId, String jobTitle, double salary) {
        super(name, gender, dOB, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+ getName()+" is writing code");
    }

    @Override
    public void attendMeeting() {
        System.out.println(getJobTitle()+" "+getName()+" is attending scrum meeting");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps for 5 hours");
    }
}
/*
2. Developer
                    variables: name, gender, age, dateOfBirth, jobTitle, employeeID, salary

                    methods: work(), attendMeeting()
 */
