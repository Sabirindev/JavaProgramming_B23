package day42_CustomClass_Constructor_this_GarbageCollection;

import day41_CustomClass_Constructor.circleTask.Circle;
import day42_CustomClass_Constructor_this_GarbageCollection.carTask.Car;
import day42_CustomClass_Constructor_this_GarbageCollection.employeeTask.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {

        int[] arr1 =  new int[3]; // {0, 0, 0}
        arr1 = new int[]{1,2,3}; // {1,2,3}

        System.out.println(Arrays.toString(arr1));

        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));

        list =  new ArrayList<>(Arrays.asList("D", "E", "F"));

        System.out.println(list);

        System.out.println("------------------------------------");

        Employee employee1 = new Employee("Yasin");
        Employee employee2 = new Employee("Feruza");

        //employee1 = employee2; //old employee1 object will be eligible for garbage collection
        System.out.println(employee1);
        System.out.println(employee2);

        System.out.println("------------------------------------------");

        String s1 = "Napkins",
                s2 = "Paper Towels";

        s2 = s1;

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("-----------------------------------------------");

        Car car1 = new Car("Toyota", "Corolla");
        Car car2 =   new Car("BMW", "X5");

        car2 = new Car("Honda", "Civic");

        System.out.println( car1 );
        System.out.println(car2);

        System.out.println("---------------------------------------------");

        Circle circle1 = new Circle(3);
        //circle1 = null;

        //     System.out.println( circle1.area() );

        System.out.println(circle1.circleArea());

        System.out.println("-------------------------------");

        String str1 = "cybertek";
        str1 = "Cybertek School";
        str1 = null;

        System.out.println( str1.toUpperCase() );// Exception in thread "main" java.lang.NullPointerException
                                              // because str1'svalue is null alrteady





    }

}
