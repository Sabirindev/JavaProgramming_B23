package day16_String_Methods;

public class EmailDomain {
    public static void main(String[] args) {
        String email = "Cybertek.computer@yahoo.com";
        //index         0123456789012345678901234567

        int beginningIndex = email.indexOf("@");// 17
        System.out.println(beginningIndex);
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex +1,endingIndex);

        System.out.println("Domain = "+domain); //gmail

    }
}
