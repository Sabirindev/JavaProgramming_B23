package day04_Variables;

public class EmployeeInfo2 {
    /*
    Task:
    1. create a class named EmployeeInfo
                1. declare the following variables:
                    name, gender, age, companyName, jobTitle, isFullTime, isMarried, salary

                2. full info of the employee

     */
    public static void main(String[] args) {
        String firstName= "Aaron",
               lastName = "King",
               fullName = firstName +" "+ lastName,
               companyName = "Apple Inc",
                jobTitle = "SDET";

        int age =25,
            salary = 120000;

        boolean isFullTime = true,
                isMarried = true;

        System.out.println("Employee' full name is:" +fullName+"\n"+"Employee' age is:"+age+"\n"+
                "Company Name is :"+companyName+"\n"+"Employee' Job Title is:"+jobTitle+"\n"+
                "Employee'salary is "+salary+"\n"+"Employee works Full Time: "+isFullTime+"\n"+
                "Employee is Married : "+isMarried);
        /*
        Employee' full name is:Aaron King
        Employee' age is:25
        Company Name is :Apple Inc
        Employee' Job Title is:SDET
        Employee'salary is 120000
        Employee works Full Time: true
        Employee is Married : true
         */

    }
}
