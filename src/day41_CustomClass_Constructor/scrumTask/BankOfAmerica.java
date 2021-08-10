package day41_CustomClass_Constructor.scrumTask;

public class BankOfAmerica {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Sabir","SDET",'M',145000,13);
        Tester tester2 = new Tester("Hande","SDET",'F',165000,17);
        Tester tester3 = new Tester("Attila","SDET",'M',185000,25);

        Tester[] testers = {tester1,tester2,tester3};

//        System.out.println(tester1);
//        System.out.println(tester2);
//        System.out.println(tester3);

        Developer developer1 = new Developer("Vitali","Software Developer",'M',8,200000);
        Developer developer2 = new Developer("Kseniia","Java Developer",'F',9,195000);
        Developer developer3 = new Developer("Elif","Software Developer",'F',10,205000);
        Developer developer4 = new Developer("Abbos","Java Developer",'M',11,250000);

        Developer[] developers = {developer1,developer2,developer3,developer4};

        ScrumTeam scrum1 = new ScrumTeam("Farid","Marina","Shokzad");
        scrum1.hireTester(tester1);
        scrum1.hireDeveloper(developer1);
        scrum1.hireTester(testers);
        scrum1.hireDeveloper(developers);

        scrum1.hireTester(new Tester("Edison","SDET",'M',66,175000));

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