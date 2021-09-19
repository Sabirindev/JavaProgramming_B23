package day48_RECAP_OOP_Encapsulation_Inheritance.personTask;

import java.time.LocalDate;

public class Person {

    //these variables belong to Parent(Person) class, so that Person class's child classes
    // can use them by  inheriting
    private String name;
    private char gender;
    private int age;
    private LocalDate dOB;

    public Person(String name, char gender, LocalDate dOB) {
        setName(name);//this.name = name;
        this.gender = gender;
        this.dOB = dOB;
        this.age = LocalDate.now().getYear() - this.dOB.getYear();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDoB() {
        return dOB;
    }

    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dOB=" + dOB +
                '}';
    }
}
/*
Cybertek Task:
1. create a class named Person
        variables: name, gender, age, dateOfBirth
        methods: eat(), sleep(), drink()

2. create the following sub classes of Person:
            1. Student
                    variables: name, gender, age, dateOfBirth, schoolName, studentId

                    methods: study(), attendClass()

            2. Employee
                    variables: name, gender, age, dateOfBirth, jobTitle, employeeID, salary

                    methods: work(), attendMeeting()




3. create the following sub classes of Employee
            1. Tester
                    variables: name, gender, age, dateOfBirth, jobTitle, employeeID, salary

                    methods: work(), attendMeeting()


            2. Developer
                    variables: name, gender, age, dateOfBirth, jobTitle, employeeID, salary

                    methods: work(), attendMeeting()
 */
