package day13;

import java.util.Scanner;

public class SpeedChecks {
    public static void main(String[] args) {
        System.out.println("Enter your current speed");       //******IMPORTANT NOTE*******
        int currentSpeed = new Scanner(System.in).nextInt(); // if we use only one time variable,
                                                            // so we do not need to create object (scan) of Scanner class
        int speedLimit = 55,
                overSpeedLimit = currentSpeed - speedLimit;

        if(overSpeedLimit > 0){
            System.out.println("You are driving " + overSpeedLimit+ " miles over speed limit. Slow Down!");
        }
    }
}
/*
Write a program for the speed check. a variable named speedLimit is given and assigned,
ask user to enter the current speed, if the current speed is over the speedLimit print slow down,
otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!

            Enter current speed:
            45

            output:
 */
