package day29;

import java.util.Locale;

public class CM_formatFullName {
    public static void main(String[] args) {
        formatFullName("sAbiR","musTAFAYEv");

    }
    public static void formatFullName(String firstName, String lastName){
       firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
       lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

       String fullName = firstName+" "+lastName;
        System.out.println(fullName);
    }
}
/*
3.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYbErTeK", "SCHOOL");

                output:
                    "Cybertek School"
 */
