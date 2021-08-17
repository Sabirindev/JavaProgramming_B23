package day43_OOP_Encapsulation_AccessModifiers.itemTask;

public class MyCart {
    public static Item item1,item2,item3,item4,item5;

    static {
        item1 = new Item("Milk",3,2);
        item2 = new Item("Bread",1.5,3);
        item3 = new Item("Eggs",0.5,30);
        item4 = new Item("Diapper",48,1);
        item5 = new Item("Paper Towel",25,2);

    }
}
/*
create a class called MyCart
            create 5 static variables of Items
            Add a static block to to set all the static variables
 */
