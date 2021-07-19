package day28_Methods_CustomMethods;

public class CM_CalculateAgeOfPerson {
    public static void main(String[] args) {
        calculatingAge(1986,2021);
    }
    public static void calculatingAge(int birthYear, int currentYear){
        System.out.println("Age of a person: "+(currentYear - birthYear));
    }
}
/*
3. create a method that can calculate the age of the person
 */
