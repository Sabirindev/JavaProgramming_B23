package day46_OOP_Inheritance_Super_Overrideing.emailTask;

public class Gmail extends Email{
    public Gmail(String address, int numberOfEmail) {
        super(address, numberOfEmail);
        domain = "gmail";
    }
}
