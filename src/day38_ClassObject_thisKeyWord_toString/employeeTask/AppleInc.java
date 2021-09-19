package day38_ClassObject_thisKeyWord_toString.employeeTask;

import day38_ClassObject_thisKeyWord_toString.employeeTask.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleInc {
    public static void main(String[] args) {
        System.out.println("\n******* employee1 ************");
        Employee employee1 = new Employee();
        employee1.setInfo("Sabir", 'F', 11, "SDET", 110000);
        System.out.println(employee1); // toString() implicitly

        employee1.salary = 120000;
        System.out.println(employee1);

        System.out.println("\n******* employee2 ************");
        Employee employee2 = new Employee();
        employee2.setInfo("Abbos", 'M', 77, "Developer", 150000);
        System.out.println(employee2);

        System.out.println("\n******* employee3 ************");
        Employee employee3 = new Employee();
        employee3.setInfo("Kseniia", 'F', 3, "Developer", 135000);
        System.out.println(employee3);

        System.out.println("\n******* employee4 ************");
        Employee employee4 = new Employee();
        employee4.setInfo("Atilla", 'M', 7, "SDET", 180000);
        System.out.println(employee4);

        System.out.println("\n******* employee5 ************");
        Employee employee5 = new Employee();
        employee5.setInfo("Shokzad", 'M', 12, "Developer", 165000);
        System.out.println(employee5);

        System.out.println("\n******* employee6 ************");
        Employee employee6 = new Employee();
        employee6.setInfo("Elif", 'F', 18, "Developer", 160000);
        System.out.println(employee6);

        System.out.println("\n******* employee7 ************");
        Employee employee7 = new Employee();
        employee7.setInfo("Hande", 'F', 15, "SDET", 170000);
        System.out.println(employee7);

        System.out.println("\n**************** creating ArrayList<> employees ****************");
        Employee[] arr = {employee1, employee2, employee3, employee4, employee5, employee6, employee7};

        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(arr));

        double budget = 0;

        for (Employee each : employees) {
            //System.out.println(each.name + " : "+each.salary);
            System.out.println(each);
            budget += each.salary;
            System.out.println(each.salary);
        }

        System.out.println("Total salary of all employess = "+ budget);

        System.out.println("****************** ArrayLiost<> list1 ********************");
        ArrayList<Employee> list1 =new ArrayList<>(employees);
        //System.out.println(list1);
        //remove all the employees that are making more than 130K
        list1.removeIf(employee -> employee.salary >= 130000);

        System.out.println(list1);

        System.out.println("****************** ArrayLiost<> list2 ********************");
        //remove all the employees that are not SDET
        ArrayList<Employee> list2 = new ArrayList<>();

        for (Employee each : employees) {
            if (each.jobTitle.equals("SDET")){
                list2.add(each);
            }
        }

        for (Employee each : list2) {
            System.out.println(each);
        }


        System.out.println(employee1);




    }
}
