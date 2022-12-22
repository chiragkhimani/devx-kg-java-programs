package com.java.class8;

public class ElseIF {

    public static void main(String[] args) {

        //hasLicense
        //speedLimit
        //if hasLicense and speedLimit is less than 80
        //then say Safe Journey

        //if hasLicense and speedLimit is more than 80
        //then give speeding ticket

        //if doesnt have license and speedLimit is less than 80
        //then print out tow the car

        //if no license and speed limit is more than 80
        //call to court session.

        boolean hasLicense = true;
        int speed = 80;

        //one if statement is like one use case, one scenario from your users(application)

        //as soon as you get a true if or else if statement you execute that if stament
        //and jump out of the whole else if group.

        if (hasLicense && speed < 80) {
            System.out.println("have a safe Journey");
        }
        else if (hasLicense && speed >= 80) {
            System.out.println("Here is your speeding ticket");
        }

        else if(!hasLicense && speed < 80) {
            System.out.println("We have to tow your car");
        }

        else if(!hasLicense && speed >= 80) {
            System.out.println("You must appear in the court");
        }

        //else means none of the above if statement were true
        else {
            System.out.println("Buy a car");
        }


        //the coding standard is :
        // usually the pairs go as
        //if
        //one or more else ifs
        //else


    }
}
