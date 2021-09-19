package day55_OOP_Recap_CollectionIntro;

import day37_Custom_Class.CC_Dog;
//import day51_Abstraction.shapeTask.Circle;
//import day51_Abstraction.shapeTask.Rectangle;
//import day51_Abstraction.shapeTask.Shape;


import day51_OOP_Abstraction.shapeTask.Circle;
import day51_OOP_Abstraction.shapeTask.Rectangle;
import day51_OOP_Abstraction.shapeTask.Shape;

public class Polymorphism {
    public static void main(String[] args) {

        Object obj =  (Object) new CC_Dog();
        // obj.play();
        (  (CC_Dog) obj ).play(); // down casting

        System.out.println( obj instanceof CC_Dog);

        System.out.println("--------------------------------------");

        Shape obj2 =  new Circle(3);

        System.out.println( obj2.area() );
        System.out.println( ((Circle) obj2).getR() );

        System.out.println(obj2 instanceof Rectangle);


        // System.out.println( ((Rectangle)obj2).getW() );

        Circle c1 = new Circle(5);

        // Rectangle r1 = (Rectangle) c1;



    }
}
