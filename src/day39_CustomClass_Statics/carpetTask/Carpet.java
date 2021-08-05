package day39_CustomClass_Statics.carpetTask;

import java.text.DecimalFormat;

public class Carpet {
    public double width, length, unitPrice; // instance variables
    public boolean isPersian; // instance variables

    public void customerOrder(double width, double length, double unitPrice, boolean isPersian) { //instance method
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calCalcCost() {  //instance method
        double totalPrice = (width * length) * unitPrice;
        return (isPersian) ? totalPrice + 200 : totalPrice;
    }

    public String toString() {  //instance method
        DecimalFormat df = new DecimalFormat("0.00");
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", total Price = $" + df.format(calCalcCost() )+
                '}';
    }
}
/*
create a custom class for the Carpet class that should contain the following:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)
                instance methods:
                        customOrder(): sets the carpet' width, length, unitprice, & isParsian
                        calcCost(): should be able to caculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
            total price of carpet = (width*length)*unitprice
            if the carpet is persian  carpet, add 200$ to the totalPrice
 */
