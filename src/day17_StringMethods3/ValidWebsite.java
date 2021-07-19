package day17_StringMethods3;



public class ValidWebsite {
    public static void main(String[] args) {
        String url = "www.amazon.com";
        boolean isValidUrl = url.startsWith("www.") && url.endsWith(".com")||
                url.endsWith(".edu")||url.endsWith(".gov");

        if (isValidUrl){
            System.out.println(url+" is valid website");
        }else {
            System.out.println(url+" is NOT valid website");
        }

    }
}
/*
2. write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
 */
