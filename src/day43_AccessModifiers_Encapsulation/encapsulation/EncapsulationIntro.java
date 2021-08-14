package day43_AccessModifiers_Encapsulation.encapsulation;

public class EncapsulationIntro {

    private String userName = "Cybertek",
            password = "123456789";

    public String getUserName() {//allows us to read the data from outside the class
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        if (userName.length()<5){
            System.out.println("User name needs to be at least 5 characters long");
            return;
        }
        this.userName = userName;
    }

    public void setPassword(String password) {
        if (password.length()<8){
            System.out.println("Password needs to be at least 8 characters long");
            return;
        }
        this.password = password;
    }

}
