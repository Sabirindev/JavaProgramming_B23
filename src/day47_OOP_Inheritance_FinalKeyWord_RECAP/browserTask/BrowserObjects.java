package day47_OOP_Inheritance_FinalKeyWord_RECAP.browserTask;

public class BrowserObjects {
    public static void main(String[] args) {
        System.out.println("************ Chrome **************");
        Chrome chrome = new Chrome(); //opens chrome browser
        chrome.open();
        chrome.close();

        System.out.println("\n********* Firefox ***************");

        FireFox fireFox = new FireFox(); // opens firefox browser
        fireFox.open();
        fireFox.close();

        System.out.println("\n************* Opera ***********");

        Opera opera = new Opera();
        opera.open();
        opera.close();
    }
}
