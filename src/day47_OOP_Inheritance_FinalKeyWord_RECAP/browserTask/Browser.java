package day47_OOP_Inheritance_FinalKeyWord_RECAP.browserTask;

public class Browser {

    public void open(){
        System.out.println("Opening Chrome Browser");
    }

    public void close(){
        System.out.println("Closing Chrome Browser");

    }

    public final void navigate(String url){
        System.out.println("Type: "+url);
        System.out.println("Press Enter");

    }

    public final void refresh(){
        System.out.println("F5");
    }

    public final void  backward(){
        System.out.println("backward");
    }
    public final void forward(){
        System.out.println("forward");
    }

}
/*
open()
close()
navigate()
refresh()

chrome1.navigate("google.com");
chrome2.navigate("facebook");
 */
