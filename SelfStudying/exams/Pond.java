package exams;

public class Pond {
    static Water water;

    public Pond(String color) { // this is the line 5

        water= new Water(color);
    }

//    public static void main(String[] args) {
//        new Pond("sabir");
//
//    }

      class Sabir{

    }
}

class Water{
    String color;
    public Water(){
        System.out.println("SSSSSSSSSSSSSSSS");
    }

    public Water(String color){
        this.color = color;
        //System.out.println("contsructor with string parameter");
    }

}


