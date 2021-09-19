package day49_Exceptions;

public class ThrowKeyword {
    public static void main(String[] args) {

        //  throw new RuntimeException("This is an unexpected event");

        //System.out.println("");

        String browser = "chrome";

        //chrome, firefox, opera, safari

        if(browser.equalsIgnoreCase("chrome")){
            System.out.println("Chrome browser is selected");
        }else if(browser.equalsIgnoreCase("firefox")){
            System.out.println("Firefox browser is selected");
        }else if(browser.equalsIgnoreCase("opera")){
            System.out.println("Opera browser is selected");
        }else if(browser.equalsIgnoreCase("safari")){
            System.out.println("safari browser is selected");
        }else{
            throw new RuntimeException("Invalid Browser name: "+browser);
        }

        //  throw new Circle(10);

        throw new BreakTimeException("Time to take 15 minutes break");
        // throw new BreakTimeException();




    }

}
