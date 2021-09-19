package day53_OOP_Abstraction_Interface_POLYMORPHISM.polynorphism;


import day45_OOP_Inheritance.employeeTask.*;
import day51_OOP_Abstraction.shapeTask.Circle;
import day51_OOP_Abstraction.shapeTask.Rectangle;
import day51_OOP_Abstraction.shapeTask.Shape;
import day51_OOP_Abstraction.shapeTask.Square;
import day53_OOP_Abstraction_Interface_POLYMORPHISM.webDriverTask.ChromeDriver;
import day53_OOP_Abstraction_Interface_POLYMORPHISM.webDriverTask.WebDriver;

import javax.sound.midi.Receiver;
import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphismIntro {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape quare = new Square(10);
        Shape rectangle = new Rectangle(4, 5);

     /*
     WebDriver driver = new ChromeDriver();
                        new FireFoxDriver();
                        new OperaDriver();
      */

        System.out.println("*************** Polymorphisim ****************");

        Shape array[]={
                new Circle(5),
                new Square(10),
                new Rectangle(4, 5)
        };

        System.out.println("***********************************************");

        Employee employee1 = new Tester("Sabir",'M',35,131313,"SDET Lead",13131.3);

        boolean isDeveloper =  employee1 instanceof Developer;
        boolean isTester = employee1 instanceof Tester;
        //  boolean isHonda = employee1 instanceof Honda;
        boolean isPerson = employee1 instanceof Person;
        boolean isDriver = employee1 instanceof Driver;

        System.out.println(isDeveloper);
        System.out.println(isTester);
        //    System.out.println(isHonda);
        System.out.println(isPerson);
        System.out.println(isDriver);


        System.out.println("-----------------------------------------------");

        ArrayList<Shape> shapes = new ArrayList<>(Arrays.asList(array));
        shapes.addAll(Arrays.asList(
                new Square(15),  new Square(15),  new Square(15),
                new Square(15),  new Square(15),  new Square(15),  new Square(15),
                new Circle(10), new Circle(10), new Circle(10), new Circle(10), new Circle(10), new Circle(10),
                new Rectangle(100, 200),  new Rectangle(100, 200),  new Rectangle(100, 200),  new Rectangle(100, 200),
                new Square(15)
        ));

        int numberOfSquares = 0,
        numberOfRestangles = 0,
                numberOfCircle = 0;

        for (Shape eachShape : shapes) {
            if (eachShape instanceof Rectangle){
                numberOfRestangles++;
            }else if (eachShape instanceof Square) {
                numberOfSquares++;
            }else {
                numberOfCircle++;
            }
        }

        System.out.println("numberOfSquares = " + numberOfSquares);
        System.out.println("numberOfRestangles = " + numberOfRestangles);
        System.out.println("numberOfCircle = " + numberOfCircle);

        System.out.println("---------------------------------------------");

        WebDriver driver = new ChromeDriver();

        if(driver instanceof ChromeDriver){
            System.out.println("Maximize Window");
        }else{
            System.out.println("Minimize Window");
        }


    }
}
