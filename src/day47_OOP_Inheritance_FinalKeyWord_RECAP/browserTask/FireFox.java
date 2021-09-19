package day47_OOP_Inheritance_FinalKeyWord_RECAP.browserTask;

public final class FireFox extends Browser{ // FireFox is A Browser


    @Override
    public void open() {
        System.out.println("Opening FireFox browser");
    }

    @Override
    public void close() {
        System.out.println("Closing FireFox browser");
    }
}
