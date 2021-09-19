package day53_OOP_Abstraction_Interface_POLYMORPHISM.webDriverTask;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("FirefoxDriver - navigating to:" +url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("FirefoxDriver - locating the element by "+locator);

    }

    @Override
    public void getTitle() {
        System.out.println("firefoxDriver - getting title");

    }

    @Override
    public void quit() {
        System.out.println("FirefoxDriver - quitting entire browser");

    }

    @Override
    public void close() {
        System.out.println("FirefoxDriver - closing the tab");

    }
}
