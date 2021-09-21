package oop.encapsulation.task1;

public final class Encapsulation1 {//Encapsulation1 class can be final but it never has subclasses(child)
    private String carName;
    private static String libraryName;
    static{
        libraryName = "Brooklyn library";
    }

    public final String getCarName() {
        return carName;
    }

    //final keyword cn be used in settet method, and this final setter metthod
    //will run well in other class, but it can not be Overrided
    //that is why we do not need to use final keyword in signature of setter method
    public final void setCarName(String carName) {
        this.carName = carName;
    }

    public static String getLibraryName() {
        return libraryName;
    }

    //private static filed' value can only be changed from
    //other class by declaring setterr() method as static in that class.
    public static void setLibraryName(String libraryName) {
        Encapsulation1.libraryName = libraryName;
    }


    @Override
    public String toString() {
        return "Encapsulation1{" +
                "carName='" + carName + '\'' +
                "Library name" + libraryName + '\'' +
                '}';
    }
}
