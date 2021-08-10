package day42_CustomClass_Constructor_this_GarbageCollection.warmTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemObjects {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.addAll(Arrays.asList(
                new Item("Dog Food", 10, 2),
                new Item("Cat Food", 8, 3),
                new Item("Brush", 3.5, 2), new Item("Baklava", 10, 50),
                new Item("Soda", 6.5, 100),
                new Item("Cake", 3.5, 50),
                new Item("Gum", 2.2, 150),
                new Item("Tomato Sauce", 1.5, 140),
                new Item("Pizza Sauce", 1.7, 130),
                new Item("Salsa Sauce", 1.7, 130)
        ));

        items.removeIf(item -> item.unitPrice > 3 );

        double totalPrice = 0;
        for (Item eachItem : items) {
            totalPrice += eachItem.calcCost();
        }
        System.out.println(totalPrice);



    }
}
