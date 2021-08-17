package day46_OOP_Inheritance_Super_Overrideing.emailTask;

public class Email {

    final String address;
    public  int numberOfEmail;
    public String domain = "generic";

    public Email(String address, int numberOfEmail) {
        this.address = address;
        this.numberOfEmail = numberOfEmail;
    }

    public String toString() {
        return "Email{" +
                "address='" + address + '\'' +
                ", numberOfEmail=" + numberOfEmail +
                ", domain='" + domain + '\'' +
                '}';
    }
}
/*
EmailTask
    Create a class called Email
        instance variables:
            address (final)
            numberOfEmail
            domain: by default set to "generic"

        add a constructor that can initialize address & numberOf emails
        add toString methods

    create the following sub classes of Email:
            1. Gmail: domain MUST be "gmail"
            2. Yahoo: domain MUST be "yahoo"
            3. Hotmail: domain MUST be "hotmail"

 */