package constructor;

public class Teacher {
    public String name;
    public int age;


    public Teacher() {
        System.out.println("No args constr");
        method1();
    }

    public Teacher(String name) {
        this.name = name;
        System.out.println(name+" name param constr");

    }

    public Teacher(int age) {
        this.age = age;
        System.out.println(age+" age param constr");

    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name+"-"+age+" name&ge param constr");

    }

    public void method1(){
        //  this(); Compiler ERROR
        System.out.println("Method 1 is running");
    }

}
