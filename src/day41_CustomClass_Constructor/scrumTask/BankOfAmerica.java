package day41_CustomClass_Constructor.scrumTask;

public class BankOfAmerica {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Sabir",'M',"SDET",13,145000);
        Tester tester2 = new Tester("Hande",'F',"SDET",17,165000);
        Tester tester3 = new Tester("Attila",'M',"SDET",25,185000);

        Tester[] testers = {tester1,tester2,tester3};

//        System.out.println(tester1);
//        System.out.println(tester2);
//        System.out.println(tester3);

        Developer developer1 = new Developer("Vitali",'M',"Software Developer",200000,8);
        Developer developer2 = new Developer("Kseniia",'F',"Java Developer",195000,9);
        Developer developer3 = new Developer("Elif",'F',"Software Developer",205000,10);
        Developer developer4 = new Developer("Abbos",'M',"Java Developer",250000,11);

        Developer[] developers = {developer1,developer2,developer3,developer4};

        ScrumTeam scrum1 = new ScrumTeam("Farid","Marina","Shokzad");
        scrum1.hireTester(tester1);
        scrum1.hireDeveloper(developer1);
        scrum1.hireTester(testers);
        scrum1.hireDeveloper(developers);

        scrum1.hireTester(new Tester("Edison",'M',"SDET",175000,66));

        System.out.println(scrum1);

        double budget = 0;

        for (Tester eachTester : scrum1.testers) {
            budget += eachTester.salary;
        }


        for (Developer eachDeveloper : scrum1.developers) {
            budget +=eachDeveloper.salary;
        }

        System.out.println("budget = "+budget);

        //*********** HomeWorks ********************
        ScrumTeam scrum2 = new ScrumTeam("","","");//add 5 testers & 6 developers
        ScrumTeam scrum3 = new ScrumTeam("","","");//add 2 testers & 4 developers

        ScrumTeam[] scrumTeams = {scrum1,scrum2,scrum3};
        /*
        for (ScrumTeam eachScrumTeam : scrumTeams) {
            for (Tester tester : eachScrumTeam.testers) {

            }

            for (Developer developer : eachScrumTeam.developers) {

            }
        }
        1. total budget
        2. total Number of testers in Bank of America
        3. total number of developers in Bank of America
        4. what's the max & min salaries of the tester
        5. what's the max & min salaries of the developers

         */

    }
}
/*
create a class called MyScrumTeam:
                    1. create an array of Testers and add the testers from your group
                    2. create an array of developers add the developers from your group
                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */