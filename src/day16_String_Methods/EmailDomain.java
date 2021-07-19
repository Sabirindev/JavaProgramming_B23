package day16_String_Methods;

public class EmailDomain {
    public static void main(String[] args) {
        String email = "Cybertek.computer@yahoo.com";


        int beginningIndex = email.indexOf('@') + 1;
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex,endingIndex);

        System.out.println("Domain = "+domain); //gmail

    }
}
