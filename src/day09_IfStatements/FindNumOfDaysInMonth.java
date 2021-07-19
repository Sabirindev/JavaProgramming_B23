package day09_IfStatements;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class FindNumOfDaysInMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        String numberOfDays = "";

        if (month>0 && month <13) {
            if (month == 2) {
                numberOfDays = "28 days";
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                numberOfDays = "30 days";
            } else {
                numberOfDays = "31 days";
            }
        }else {
            numberOfDays = "Wrong input, try again";
        }
        System.out.println(numberOfDays);

    }
}
