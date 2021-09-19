package day49_Exceptions;



import day43_OOP_Encapsulation_AccessModifiers.objectTask.Circle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlings {
    public static void main(String[] args) {

        String str = "Cybertek";

        try {
            System.out.println(str.charAt(200));//unchecked exceptions
        }catch (StringIndexOutOfBoundsException s){
            System.out.println("string index out of bound exception occured");
        }

        str += " School";

        System.out.println(str);

        System.out.println("***************************************");

        try{
            System.out.println(9/0);
        }catch(IllegalArgumentException e){
            //System.out.println("Illegal Arg exception");
            e.printStackTrace();
        }catch(IndexOutOfBoundsException e){
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch(ArithmeticException e){
            //System.out.println(e.getMessage()); // by zero
            e.printStackTrace();
        }
        catch (RuntimeException e){
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Test Completed");

        System.out.println("/n***************************************************");

        try { // plan A
            System.out.println("".substring(10, 20)); //"Cybertek"
        }catch (ArithmeticException e){ // Plan B
            e.printStackTrace();
        }catch (NumberFormatException e){ // Plan C
            e.printStackTrace();
        }catch (IllegalArgumentException e){ // Plan D
            e.printStackTrace();
        }catch (InputMismatchException e){ // Plan E
            e.printStackTrace();
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("test completed");

        System.out.println("-----------------------------------------");

        Circle circle1 = null;

        try {
            circle1.getRadius();
        }catch(RuntimeException e){
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Test completed");
    }
}
