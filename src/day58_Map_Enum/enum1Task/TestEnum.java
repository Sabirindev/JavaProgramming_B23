package day58_Map_Enum.enum1Task;

public class TestEnum {
    public static void main(String[] args) {

        // String browser ="Cydeo";

        Browser browser = Browser.chrome;

        switch (browser){
            case edge:
                System.out.println("Edge driver is selected");
                break;
            case opera:
                System.out.println("Opera driver is selected");
                break;
            case chrome:
                System.out.println("Chrome driver is selected");
                break;
            case safari:
                System.out.println("Safari driver is selected");
                break;
            case firefox:
                System.out.println("Firefox driver is selected");
                break;
            default:
        }

        //String level = "java";

        Level level = Level.Akbar;

        Month month = Month.April;

        Color color = Color.black;



    }
}
