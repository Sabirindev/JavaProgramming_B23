package day40_CustomClass_Statics.statics.bankTask;

import day38_ClassObject_thisKeyWord_toString.employeeTask.Employee;

public class HumanResource {

    public static int z= 100;

    public static Employee employee1 = new Employee();//Sabir
    //employee1.setInfo("Sabir",'M',1,"SDET",130000);
    public static Employee employee2 = new Employee();
    public static Employee employee3 = new Employee();
    public static Employee employee4 = new Employee();
    public static Employee employee5 = new Employee();
    public static Employee employee6 = new Employee();

    static {
        employee1.setInfo("Sabir",'M',1,"SDET",130000);
        employee1.setInfo("Aysu",'M',2,"SDET",130000);
        employee1.setInfo("Tamerlan",'M',3,"SDET",130000);
        employee1.setInfo("Baxtiyar",'M',4,"SDET",130000);
        employee1.setInfo("Ferhad",'M',5,"SDET",130000);
        employee1.setInfo("Sabir",'M',6,"SDET",130000);
    }

   /*
    public static void main(String[] args) {
        employee1.setInfo("Sabir",'M',1,"SDET",130000);
    }

    */
}
