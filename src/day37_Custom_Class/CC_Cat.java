package day37_Custom_Class;

public class CC_Cat {

    //Attributes of Cat Custom Class
    public String name;
    public String breed;
    public String gender;
    public String color;
    public String size;
    public int age;

    //Actions of Cat Custom Class
    public void scratch() {
        System.out.println(name + " is scratching");
    }

    public void breakThings() {
        System.out.println(name + " is breaking");
    }

    public void jump() {
        System.out.println(name + " is jumping");
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public void meow() {
        System.out.println(name + " is meowing");
    }

    public void setInfo(String catName, String catBreed, String catGender, String catColor, String catSize, int catAge) {
        name = catName;
        breed = catBreed;
        gender = catGender;
        color = catColor;
        size = catSize;
        age = catAge;
    }

    public void getInfo() {
        System.out.println("Name = " + name);
        System.out.println("Breed = " + breed);
        System.out.println("Gender = " + gender);
        System.out.println("Color = " + color);
        System.out.println("Size = " + size);
        System.out.println("Age = " + age);

    }

}
/*
Cat:
		Attribute: name, color, gender, age, breed....
		Actions: scratch(), breakThings(), jump(), eat(), drink(), meow()....
				 setInfo(), getInfo()
 */
