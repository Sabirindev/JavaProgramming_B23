package day22_do_While_Recap;

public class doWhileLoop {
    public static void main(String[] args) {
        int i = 10;

        while (i<5){
            System.out.println("Hello Cybertek");
        }

        System.out.println("*******do while***********");

        do {
            //This block is executed at least one, if the while codition is false
            System.out.println("This block is executed at least one, if the while codition is false");
        }while (i<5);
    }
}
