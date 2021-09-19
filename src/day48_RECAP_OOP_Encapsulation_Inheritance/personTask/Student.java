package day48_RECAP_OOP_Encapsulation_Inheritance.personTask;

import java.time.LocalDate;

public class Student extends Person {

     /*
    create sub classes:
        GradStudent
        UndergradStudent
        CybertekStudent:
            programmingLanguage
            loveSoftKill
            hatesJava
     */

    private int studentId;
    private String schoolName;

    public Student(String name, char gender, LocalDate dOB, int studentId, String schoolName) {
        super(name, gender, dOB);
        setStudentId(studentId);//this.studentId = studentId;
        setSchoolName(schoolName);//this.schoolName = schoolName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }

    public void attendClass(){
        System.out.println(getName()+" is attending class");
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "studentId=" + studentId +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
/*
1. Student
                    variables: name, gender, age, dateOfBirth, schoolName, studentId

                    methods: study(), attendClass()
 */
