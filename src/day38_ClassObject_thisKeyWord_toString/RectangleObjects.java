package day38_ClassObject_thisKeyWord_toString;

public class RectangleObjects {
    public static void main(String[] args) {
        System.out.println("************** rectangle1 ******************");
        //w:20, l:30
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setInfo(30,20);
        rectangle1.length = 25;
        rectangle1.getInfo();

        System.out.println("************** rectangle2 ******************");
        //w:50, l:20
        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(20,50);

        rectangle2.getInfo();




    }


}
