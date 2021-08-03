package day39_CustomClass_Statics.studentsTask;

import java.time.LocalDate;

public class Student {
    public String name;
    public char gender;
    public LocalDate DoB;
    public int age;
    public int studentID;
    public char grade;

    public void setInfo(String name, char gender, LocalDate doB, int studentID, char grade) {
        this.name = name;
        this.gender = gender;
        DoB = doB;
        this.studentID = studentID;
        this.grade = grade;
        age = LocalDate.now().getYear() - DoB.getYear();

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", DoB=" + DoB +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }
}
/*
StudentTask
    1. create a class named Student that has the followings features:
                Attributes:
                    name, gender, dateOfBirth, age, studentID, grade

            Methods:
                setInfo(): sets all the attributes of the student object
                toString(): returns the full info of student Object
 */
