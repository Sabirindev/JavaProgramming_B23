package day11_Switch;

public class SwitchStatements2 {
    public static void main(String[] args) {
        String name = "chre";

        // valid browsers: chrome, firefox, edge

        switch (name){

            case "chrome":
                System.out.println("Chrome Browser is selected");
                break; //case closed

            case "firefox":
                System.out.println("Firefox Browser is selected");
                break; //case closed

            case "edge":
                System.out.println("Edge Browser is selected");
                break; // case closed

            default:
                System.err.println("Invalid Browser Name");
                //break;

        }

    }
}
