package day10_If_Nested_If_Ternary_Statements;

public class AgeOfGroups {
    /*
    write a program that can define the age groups of a person
                 age groups are:
                        infant ( < 3 year)
                        Toddler (3 - 5),
                        Kid (6 - 9),
                        Pre-Teen (10 - 12),
                        Teenager (13 - 17),
                        Young Adult (18 - 20),
                        Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),
                        Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),
                        Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)

     */
    public static void main(String[] args) {
        int age = 0;
        String nameOfGroup = "";

        if (age > 0 && age < 135) {
            if (age >= 85) {
                nameOfGroup = "Old Senior Citizen";
            } else if (age >= 75) {
                nameOfGroup = "Senior Citizen";
            } else if (age >= 65) {
                nameOfGroup = "Young Senior Citizen";
            } else if (age >= 55) {
                nameOfGroup = "Very Young Senior Citizen";
            } else if (age >= 50) {
                nameOfGroup = "Middle=aged Adult";
            } else if (age >= 40) {
                nameOfGroup = "Young Middle-Aged Adult";
            } else if (age >= 21) {
                nameOfGroup = "Adult";
            } else if (age >= 18) {
                nameOfGroup = "Young Adult";
            } else if (age >= 13) {
                nameOfGroup = "Teenager";
            } else if (age >= 10) {
                nameOfGroup = "Pre-Teen";
            } else if (age >= 6) {
                nameOfGroup = "Kid";
            } else if (age >= 3) {
                nameOfGroup = "Toddler";
            } else {
                nameOfGroup = "infant";
            }
        } else {
            nameOfGroup = "Sorry, no such an age";
        }
        System.out.println(nameOfGroup);
    }
}

