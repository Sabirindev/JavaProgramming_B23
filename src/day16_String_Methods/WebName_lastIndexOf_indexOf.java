package day16_String_Methods;

public class WebName_lastIndexOf_indexOf {
    public static void main(String[] args) {
        String url = "www.amazon.com";

        //****indexOf()******************
        int beginningIndex = url.indexOf(".")+1,
                //*************lastImdexOf()*******************
                endigIndex = url.lastIndexOf(".");

        String name = url.substring(beginningIndex,endigIndex);

        String domain = url.substring(endigIndex + 1);

        System.out.println("name = "+name+"\n"+
                            "domain = "+domain);

    }
}
