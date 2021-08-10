package day41_CustomClass_Constructor.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO;
    public String BA;
    public String  SM;
    public ArrayList<Tester>testers;
    public ArrayList<Developer> developers;

    public ScrumTeam(String PO, String BA, String SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        testers = new ArrayList<>();
        developers = new ArrayList<>();
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", number of testers=" + testers.size() +
                ", number of developers=" + developers.size() +
                '}';
    }

   //****************** TESTERS ***********************************
    public void hireTester(Tester tester){
        testers.add(tester);
    }

    public void hireTester(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void removeTester(int id){
        testers.removeIf(tester-> tester.employeeID == id);
    }

    //************************ DEVELOPERS **********************
    public void hireDeveloper(Developer developer){
        developers.add(developer);
    }
    public void hireDeveloper(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }
    public  void removeDeveloper(int id){
        this.developers.removeIf(Developer-> Developer.employeeID == id);
    }
}
/*
create a class called ScrumTeam
           Attributes:
                String PO, BA, SM;
                ArrayList<Tester> testersList = new ArrayList<>();
                ArrayList<Developer> devopsList = new ArrayList<>();
               int daysOfSprint;

             Actions:
                  setInfo(): sets the names of PO, BA, SM
                  addTester(Tester tester): adds the given tester to the testers ArrayList

                  addTesters(Tester[] testers): adds the given testers to the testers ArrayList

                  addDeveloper(Developer developer): adds the given developer to the developers ArrayList

                  addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList
                 removeTester(long employeeID): removes the given tester from the testers ArrayList

                 removeDeveloper(long employeeID): removes the developer from the developers ArrayList

                  toString(): prints number of tester,& developers,  PO name, SM name, BA name
 */
