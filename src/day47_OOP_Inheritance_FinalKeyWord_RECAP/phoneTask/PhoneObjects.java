package day47_OOP_Inheritance_FinalKeyWord_RECAP.phoneTask;

public class PhoneObjects {
    public static void main(String[] args) {

        System.out.println("");

        IPhone iphone = new IPhone("12","large","Black",1100);
        iphone.call(911);
        iphone.call(12345678,9876543);
        iphone.text(55555555);
        iphone.faceTime(88888888,99999999);

        System.out.println(iphone);

        System.out.println("\n********************* Sumsung **************************");

        Samsung samsung = new Samsung("galaxy s6","large","Red",1000);
        samsung.call(9999999);
        samsung.text(123456);
        samsung.text(987456, 852369);
        samsung.text(741258, 963147, 852147);
        samsung.freeze();
        //samsung.faceTime(8888888888888888888);// bc sumsung does not have faceTime method
        System.out.println(samsung);


        System.out.println("\n************ Nokia ****************************");
        Nokia nokia = new Nokia("Brick","small","White",200);
        nokia.call(896523);
        nokia.text(8547126);
        nokia.selfDefense();
        nokia.breakTheFloor();
        //   nokia.freeze();
        //   nokia..faceTime(123456789);

        System.out.println(nokia);

        nokia.setPrice(75);
        nokia.setColor("Blue");
        System.out.println(nokia.getPrice());

        System.out.println(nokia);
    }
}
