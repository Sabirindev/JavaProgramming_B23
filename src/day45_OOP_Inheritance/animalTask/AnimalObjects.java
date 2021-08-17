package day45_OOP_Inheritance.animalTask;

public class AnimalObjects {
    public static void main(String[] args) {

        System.out.println("\n********************** Dog ***********************");
        Dog dog1 = new Dog("Lacey","Husky",'M',"Medium",3,"black");
        dog1.bark();
        dog1.eat("dog food");
        dog1.drink("water");
        dog1.sleep();
        System.out.println(dog1);
        System.out.println(Dog.breath);
        System.out.println(Dog.sleeps);

        System.out.println("\n********************** Cat ***********************");
        Cat cat1 = new Cat("Boncuq","aaa",'F',"Small",2,"Grey");
        cat1.meow();
        cat1.drink("milk");
        cat1.eat("Cat food");
        cat1.sleep();
        System.out.println(cat1);

        System.out.println("\n********************** Tiger ***********************");

        Tiger tiger1 = new Tiger("Hunter","Siberian Tiger",'M',"Large",5,"light orange and dark sstripes");
        tiger1.eat("Human");
        System.out.println(tiger1);

    }
}
