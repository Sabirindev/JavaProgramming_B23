package day46_OOP_Inheritance_Super_Overrideing.emailTask;

public class Hotmail extends Email{
    public Hotmail(String address, int numberOfEmail) {
        super(address, numberOfEmail);
        domain = "hotmail";
    }
}
