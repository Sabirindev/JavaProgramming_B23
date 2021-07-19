package day11;

public class AgeGroup_NestedIf {
    public static void main(String[] args) {
        int age = 35;
        String ageGroup = "";

        if (age > 0 && age < 150) {
            if (age < 21) {
                ageGroup = "Tenage";
            } else if (age >= 21 && age < 55) {
                ageGroup = "Adult";
            } else {
                ageGroup = "Senior";
            }
        }else{
            ageGroup = "Invalid Age entered";
        }
        System.out.println(ageGroup);

    }
}

/*
write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

                  NOTE: MUST APPLY NESTED IF
 */
