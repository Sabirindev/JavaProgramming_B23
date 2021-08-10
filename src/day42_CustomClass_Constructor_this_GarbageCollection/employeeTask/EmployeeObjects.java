package day42_CustomClass_Constructor_this_GarbageCollection.employeeTask;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Sabir");
        Employee employee2 =new Employee("Abbos","SDET");
        Employee employee3 =new Employee("Marina","SDET",5);
        Employee employee4 =new Employee("Atilla","SDET",10,400000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
    }
}
