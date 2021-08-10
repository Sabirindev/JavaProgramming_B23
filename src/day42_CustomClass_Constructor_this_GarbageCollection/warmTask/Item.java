package day42_CustomClass_Constructor_this_GarbageCollection.warmTask;

public class Item {

    public String name;
    public double unitPrice;
    public int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){
        return unitPrice * quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice = $" + unitPrice +
                ", quantity =" + quantity +
                ", total price = $"+calcCost() +
                '}';
    }

}

/*
. Create a class called Item
            Variables:
                name, unitPrice, quantity
            Add a constructor to initialize all the fields
            Methods:
                calcCost(): returns the total price of the Item
                toString()
 */
