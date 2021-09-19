package day54_OOP_Polymorphism_Interface;

import day45_OOP_Inheritance.employeeTask.Developer;
import day45_OOP_Inheritance.employeeTask.Employee;
import day45_OOP_Inheritance.employeeTask.Tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WarmUpTask {
    public static void main(String[] args) {
        Employee[] employees = {
                new Tester("John", 'M', 32, 11, "QA", 110000),
                new Developer("Selda", 'F', 27, 12, "Java Developer", 128000),
                new Tester("Robinson", 'M', 28, 10, "SDET", 120000),
                new Developer("Aysu", 'F', 23, 13, "Software Developer", 135000),
                new Tester("Jimmy", 'M', 30, 14, "SDET", 105000),
                new Developer("Gulistan", 'F', 26, 17, "Web Developer", 130000),
                new Tester("Breanna", 'F', 28, 15, "QE", 120000),
                new Developer("Ivana", 'F', 29, 18, "Front-end Developer", 140000),
                new Tester("Shay", 'F', 25, 16, "SDET", 130000),
                new Developer("Sophie", 'F', 26, 10, "Back-end Developer", 150000),
                new Tester("Aaron", 'M', 34, 19, "SDET", 115000),
                new Developer("Ibrahim", 'F', 26, 10, "Full Stack Developer", 142000),
                new Tester("Feruza", 'F', 24, 21, "QE", 125000)
        };

        // store all the developers & testers into the following List of employees
        //3                                 //2+3
        //((ArrayList)scrumMasters) //dowb-casting: used for accesssing the methods & variables of the object type
        List<Employee> scrumMembers = new ArrayList<>(Arrays.asList(employees));//up-Casting
        System.out.println("scrumMembers = " + scrumMembers);
        System.out.println("scrumMembers.size() = " + scrumMembers.size());

        System.out.println("\n**********************************************************************");

        // store all the testers into the following List of testers:
        List<Tester> testers = new ArrayList<>();

        // store all the developers into the following List of developers
        List<Developer> developers = new ArrayList<>();

        for (Employee employee : scrumMembers) {
            if (employee instanceof Tester) {
                testers.add((Tester) employee);
            }

            if (employee instanceof Developer) {
                developers.add((Developer) employee);
            }
        }

        System.out.println("testers = " + testers);

        System.out.println("\n********************************************************");

        System.out.println("developers = " + developers);

        System.out.println("\n********** which tester has the maximum salary? **************");
        // which tester has the maximum salary?

        double maxSalaryOfTester = Double.MIN_VALUE;
        String nameOfTesterWithMaxSalary = "";

        double minSalaryOfTester = Double.MAX_VALUE;
        String nameOfTesterWithMinSalary = "";

        for (Tester eachTester : testers) {
            if (eachTester.salary > maxSalaryOfTester) {
                maxSalaryOfTester = eachTester.salary;
                nameOfTesterWithMaxSalary = eachTester.name;
            }
            if (eachTester.salary < minSalaryOfTester) {
                minSalaryOfTester = eachTester.salary;
                nameOfTesterWithMinSalary = eachTester.name;
            }
        }

        System.out.println("maxSalaryOfTester = " + maxSalaryOfTester);
        System.out.println("nameOfTesterWithMaxSalary = " + nameOfTesterWithMaxSalary);

        System.out.println("minSalaryOfTester = " + minSalaryOfTester);
        System.out.println("nameOfTesterWithMinSalary = " + nameOfTesterWithMinSalary);


        System.out.println("\n************ which developer has the maximum salary? ***********");
        // which developer has the maximum salary?

        double maxSalaryOfDeveloper = Double.MIN_VALUE;
        String nameOfDeveloperWithMaxSalary ="";

        double minSalaryOfDeveloper = Double.MAX_VALUE;
        String nameOfDeveloperWithMinSalary ="";

        for (Developer eachDeveloper : developers) {
            if (eachDeveloper.salary > maxSalaryOfDeveloper){
                maxSalaryOfDeveloper = eachDeveloper.salary;
                nameOfDeveloperWithMaxSalary = eachDeveloper.name;
            }

            if (eachDeveloper.salary < minSalaryOfDeveloper){
                minSalaryOfDeveloper = eachDeveloper.salary;
                nameOfDeveloperWithMinSalary = eachDeveloper.name;
            }
        }

        System.out.println("maxSalaryOfDeveloper = " + maxSalaryOfDeveloper);
        System.out.println("nameOfDeveloperWithMaxSalary = " + nameOfDeveloperWithMaxSalary);

        System.out.println("minSalaryOfDeveloper = " + minSalaryOfDeveloper);
        System.out.println("nameOfDeveloperWithMinSalary = " + nameOfDeveloperWithMinSalary);




    }
}
