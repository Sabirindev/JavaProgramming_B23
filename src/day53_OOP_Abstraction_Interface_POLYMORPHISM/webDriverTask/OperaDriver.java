package day53_OOP_Abstraction_Interface_POLYMORPHISM.webDriverTask;

public class OperaDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("OperaDriver - navigating to:" +url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("OperaDriver - locating the element by "+locator);

    }

    @Override
    public void getTitle() {
        System.out.println("OperaDriver - getting title");

    }

    @Override
    public void quit() {
        System.out.println("OperaDriver - quitting entire browser");

    }

    @Override
    public void close() {
        System.out.println("OperaDriver - closing the tab");

    }
}
