package day47_OOP_Inheritance_FinalKeyWord_RECAP.browserTask;

public final class Opera extends Browser{

    @Override
    public void open() {
        System.out.println("Opening Opera browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Opera browser");
    }
}
