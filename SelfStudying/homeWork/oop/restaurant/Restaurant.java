package homeWork.oop.restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    public String owner, Location;
    public int numberOfStars;



    ArrayList<Server> Servers = new ArrayList<>();
    ArrayList<Chef> Chefs = new ArrayList<>();

    public void setInfo(String owner, String location, int numberOfStars) {
        this.owner = owner;
        Location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server){
        Servers.add(server);
    }

    public void hireServer(Server[] servers){
        Servers.addAll(Arrays.asList(servers));
    }

    public void hireServer(String name, int employeeID, double hourlyRate, boolean fullTime){
        Server server1 = new Server();
        server1.setInfo(name,employeeID,hourlyRate,fullTime);
        Servers.add(server1);
    }
}
/*
3. Create a class called Restaurant

            Attributes:
                Owner (String), Location (String), numberOfStars (int)
                Servers (ArrayList of Server objects)
                Chefs (ArrayList of Chef objects)

            Actions: (all void methods)

                setInfo(): sets the owner, location, and number of stars with the given parameters
                hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
                hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList
                hireServer(String name, int employeeID, double hourlyRate, boolean fullTime): this overloaded version accept
                    the given parameters/information of a Server and will add the given Server to the ArrayList of Servers

                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList
                hireChef(String name, int employeeID, double hourlyRate, boolean fullTime): this overloaded version accept
                     the given parameters/information of a Chef and will add the given Chef to the ArrayList of Chefs

                toString(): Return (String) of all the information of a Restaurant object. No need to print the whole list of Servers
                or Chefs. Print the number of Servers and Chefs along side the other information

                terminateEmployee(String title, int employeeID): Create a method that will accept a String title which can only be
                "server" or "chef". If any other String is given it is invalid and the no action should be done (an error message
                can be given "invalid employee type"). Once you know which type of employee you are terminating use their given employeeID
                in the correct ArrayList type and remove them (you can give a message if you want: "$name was terminated").

 */
