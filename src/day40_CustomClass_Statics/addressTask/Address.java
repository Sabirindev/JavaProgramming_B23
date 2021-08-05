package day40_CustomClass_Statics.addressTask;

public class Address {

    public String buildingNumber, street, city, state;
    public int zipCode;

    public static String country = "USA";

    public void setInfo(String buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    /*
    public void setInfo(){
        System.out.println(country);
        System.out.println(buildingNumber); //instance method accepts static & none-statics (objects can share class members)
    }
    public static void setInfo2(){
        System.out.println(country);
        System.out.println(buildingNumber); //static only accepts static members ( class cannot share object' members)
    }
*/

    public String toString() {
        return buildingNumber + " " + street + "\n" + city + " " + state + ", " + zipCode;
    }
}
/*
1. Create a class named Address
    Attributes:
        instance:  buildingNumber, street, city, state, zipCode; (Multiple copies are needed)
        static: country (USA only)
    Actions
            setInfo: sets all the instances
            toString: returns the address
                        EX:
                            7925 Jones Branch Dr
                            McLean Va, 22012
 */

/*
2. Create a class named Movie
    Attributes:
        country (String), title (String), Genre (String), releaseDate (LocalDate), director (String), casts (ArrayList<String>)

    Instance methods
        setInfo(): sets the country, title, release date, and director of the Movie
        addCast(String): adds the given string argument to the arrayList casts
        addCast(String[]): adds the given string array argument to the arrayList casts
        addCast(ArrayLis<String>): adds the given string arraylist argument to the arrayList casts
        toString(): returns the name of country, title, release date, and total number of casts

      create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cybertek Batch 23
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: May/17/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Mehmet, Akbar and 5 more students from your group

            print the full info of the movie
 */
