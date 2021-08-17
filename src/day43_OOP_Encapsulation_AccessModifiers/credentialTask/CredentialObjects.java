package day43_OOP_Encapsulation_AccessModifiers.credentialTask;

public class CredentialObjects {
    public static void main(String[] args) {
        Credentials credentials = new Credentials("bir","123456789");
        System.out.println(credentials);

        credentials.setUsername("Sabir13");
        credentials.setPassword("Qwerty13*");
        System.out.println(credentials);

        System.out.println("*****************======================*************************");

        Credentials gmail =  new Credentials(null, null);

        gmail.setUsername("gmail.com");
        gmail.setPassword("gmail123456!");


        System.out.println(gmail.getUsername());
        System.out.println(gmail.getPassword());

    }
}
