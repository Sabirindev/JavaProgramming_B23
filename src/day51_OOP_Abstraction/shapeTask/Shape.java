package day51_OOP_Abstraction.shapeTask;

public abstract class Shape {

    private final String name;

    public Shape(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) { // name is final that is why settermethod is no longer needed
//        this.name = name;
//    }

    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape{" +
                " name = " + name + '\'' +
                ", area = " + area() +
                ", perimeter = " + perimeter()+
                '}';
    }
}
