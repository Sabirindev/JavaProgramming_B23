package day44_RECAP_ClassObject_InstanceStatic.personTask;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    //private INSTANCE variables
    private String name;
    private char gender;
    private int age;

    //private final(constant) INSTANCE variables
    private final LocalDate dateOfBirth;
    private final String countryName;
    private final String language;

    //private final(constant) STATIC variables
    public static final boolean isHuman;
    public static final String planet;

    // static block for initializing the static variables
    static {
        isHuman = true;
        planet = "Earth";
    }


    //Person contructor with 5 arguments means when we create object we should give 5 arguments
    public Person(String name, char gender, LocalDate dateOfBirth, String countryName, String language) {
        setName(name);//this.name = name;
        setGender(gender);//this.gender = gender;

        if (dateOfBirth.isBefore(LocalDate.now())) {
            this.dateOfBirth = dateOfBirth;
        } else {
            System.out.println("Please enter existing date ");
            this.dateOfBirth = null;
        }

        this.countryName = countryName;
        this.language = language;
        age = LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    // ******** getter methods ***********
    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getLanguage() {
        return language;
    }


    //******* setter methods *********************
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        if (gender != 'M' || gender != 'F') {
            System.out.println("enter correct form of gender \'M\' || \'F\' ");
            return;
        }
        this.gender = gender;
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drinks) {
        System.out.println(name + " is drinking " + drinks);
    }


    public void sleep() {
        System.out.println(name + " is sleeping ");
    }

    public String toString() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern(("MMM/dd/YYYY"));
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth.format(df) + //Aug/05/2001
                ", countryName='" + countryName + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
/*
PersonTask:
    private variables:
        name (String)
        gender (char)
        age (int)
        dateOfBirth (LocalDate & constant)
        countryOfBirth (String & constant)
        language (String & constant)
    public variables:
        isHuman (static boolean & constant)
        planet (static boolean & constant)
    Encapsulate all the fields (instances)
        (age cannot be set to negative)
    Add a constructor that can set the instances when the object is created
         (Avoid any duplicated or unnecessary code fragments)
     Extra methods:
         eat(), sleep(), drink(), toString()
 */
