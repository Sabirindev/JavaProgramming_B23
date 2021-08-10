package day42_CustomClass_Constructor_this_GarbageCollection.capitalOneTask;

import day41_CustomClass_Constructor.scrumTask.Developer;
import day41_CustomClass_Constructor.scrumTask.ScrumTeam;
import day41_CustomClass_Constructor.scrumTask.Tester;

public class CapitalOne {
    public static void main(String[] args) {
        ScrumTeam scrumTeam1 = new ScrumTeam("Zengin", "Engin", "Cengiz");
        scrumTeam1.hireTester(HumanResource.testersTeam1);
        scrumTeam1.hireDeveloper(HumanResource.devopsTeam1);

        ScrumTeam scrumTeam2 = new ScrumTeam("Selda", "Mucahit", "Dilem");
        scrumTeam2.hireTester(HumanResource.testersTeam2);
        scrumTeam2.hireDeveloper(HumanResource.devopsTeam2);

        ScrumTeam scrumTeam3 =new ScrumTeam("Mohigul","Maftuna","Zulkhumor");
        scrumTeam3.hireTester(HumanResource.testersTeam3);
        scrumTeam3.hireDeveloper(HumanResource.devopsTeam3);

        System.out.println("scrumTeam1 :"+scrumTeam1);
        System.out.println("scrumTeam2 :"+scrumTeam2);
        System.out.println("scrumTeam3 :"+scrumTeam3);

        System.out.println("----------------------------------------");

        ScrumTeam[] scrums = {scrumTeam1, scrumTeam2, scrumTeam3};

        //Task1: total budget
        System.out.println("************ total budget *************************");

        double budget = 0;

        for (ScrumTeam eachScrumTeam : scrums) { // Iterating each scrum team
            for (Tester eachTester : eachScrumTeam.testers) { // iterates each tester from each scrum team
                budget +=eachTester.salary;
            }
            for (Developer eachDeveloper : eachScrumTeam.developers) { // iterates each developer from each scrum team
                budget += eachDeveloper.salary;
            }

        }
        System.out.println("budget = " + budget);

        System.out.println("****************** total number of developers and Tester in Capital One ********************");

        //Task2: total Number of testers in CapitalOne
        //       total number of developers in Capital One
        int totalNumberOfTesters =0,
                totalNumberOfDevelopers = 0;

        for (ScrumTeam eachScrumTeam : scrums) {
            totalNumberOfTesters += eachScrumTeam.testers.size();
            totalNumberOfDevelopers += eachScrumTeam.developers.size();
        }

        System.out.println("totalNumberOfTesters = " + totalNumberOfTesters);
        System.out.println("totalNumberOfDevelopers = " + totalNumberOfDevelopers);

        System.out.println("**************************** what's the max & min salaries of the testers *************");
        double maxSalaryOfTester = 0 ;//scrums[0].testers.get(0).salary;
        double minSalaryOfTester = Double.MAX_VALUE;
        String t1 ="", t2 = "";

        for (ScrumTeam eachScrumTeam : scrums) {
            for (Tester eachTester : eachScrumTeam.testers) { // iterates each tester
                // maxSalaryOfTester = Math.max(eachTester.salary , maxSalaryOfTester);
                if(eachTester.salary > maxSalaryOfTester){
                    maxSalaryOfTester = eachTester.salary;
                    t1 = eachTester.name;
                }

                if(eachTester.salary < minSalaryOfTester){
                    minSalaryOfTester = eachTester.salary;
                    t2 = eachTester.name;
                }
            }


        }


        System.out.println("maxSalaryOfTester = " + maxSalaryOfTester +" ====>"+t1);
        System.out.println("minSalaryOfTester = " + minSalaryOfTester +" ====>" +t2);









    }
}
/*
        1. total budget
        2. total Number of testers in CapitalOne
        3. total number of developers in Capital One
        4. what's the max & min salaries of the testers
        5. what's the max & min salaries of the developers
 */
