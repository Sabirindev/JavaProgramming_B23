package day04_Variables;

public class EmployeeInfo
{
    /*
    Task:
    1. create a class named EmployeeInfo
                1. declare the following variables:
                    name, gender, age, companyName, jobTitle, isFullTime, isMarried, salary

                2. full info of the employee

     */
    public static void main(String[] args) {
        String  name = "Sabir",
                gender= "Male",
                companyName = "Cybertek",
                jobTitle = "Instructors";

        int     age =34,
                salary = 130000;

        boolean isFullTime = true,
                isMarried = false;

        System.out.println("Name : "+name+"\n"+"Gender : "+gender+"\n"+"Age : "+age+"\n"+"Company Name : "+companyName
                +"\n"+"Job Title : "+jobTitle+"\n"+"Salary : "+salary+"\n"+"Full Time Job : "+isFullTime+"\n"+
                "Married : "+isMarried);

        /*
        Name : Sabir
        Gender : Male
        Age : 34
        Company Name : Cybertek
        Job Title : Instructors
        Salary : 130000
        Full Time Job : true
        Married : false
         */



    }
}
