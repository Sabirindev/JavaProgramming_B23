package day53_OOP_Abstraction_Interface_POLYMORPHISM.webDriverTask;

public class AutomationTesting {
    public static void main(String[] args) {

        System.out.println("\n************** ChromeDriver object *********************");

        ChromeDriver driver = new ChromeDriver();
        driver.get("www.google.com");
        driver.findElement("xpath");
        driver.getTitle();
        driver.close();
        driver.quit();

        System.out.println("\n************** FirefoxDriver object *********************");

        FirefoxDriver driver1 = new FirefoxDriver();
        driver1.get("www.google.com");
        driver1.findElement("xpath");
        driver1.getTitle();
        driver1.close();
        driver1.quit();

        System.out.println("\n************** OperaDriver object *********************");

        OperaDriver driver2 = new OperaDriver();
        driver2.get("www.google.com");
        driver2.findElement("xpath");
        driver2.getTitle();
        driver2.close();
        driver2.quit();

        System.out.println("\n************** EdgeDriver object *********************");

        EdgeDriver driver3 = new EdgeDriver();
        driver3.get("www.google.com");
        driver3.findElement("xpath");
        driver3.getTitle();
        driver3.close();
        driver3.quit();

        System.out.println("\n**************************************************");

        WebDriver driver4 = new ChromeDriver();
        driver4.get("www.amazon.com");

        System.out.println("\n**************************************************");

        WebDriver driver6 = getDriver("firefox");
        WebDriver driver5v = getDriver("chrome");


    }

        public static WebDriver getDriver(String name){

            switch (name) {
                case "chrome":
                    return new ChromeDriver();

                case "firefox":
                    return new FirefoxDriver();

                default:
                    throw new RuntimeException("Invalid Browser name");
            }


    }
}
/*
	2. Create the following classes that implements the WebDriver
				1. ChromeDriver
				2. FireFoxDriver
				3. EdgeDriver

		Implement all the methods that are required
 */
