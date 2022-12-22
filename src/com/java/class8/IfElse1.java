package com.java.class8;

public class IfElse1 {


    public static void main(String[] args) {

        boolean doesHaveLicense = false;

        //first goal is to make sure the program works fine for the customers

        //the second goal is to make sure the program is written in a most
        //space(memory) and performance(speed) efficient way.


        //the program checks this if statement
        if (doesHaveLicense) {
            System.out.println("Have a safe Trip!");
        }

        //regardless of the result of the first if statement
        //the program will come and check this statement as well
        //so the program actually spends time for this if statement
        //I have to write the logic twice -> there is a high possibility you can get one
        //of the logic wrong
        if(!doesHaveLicense) {
            System.out.println("Here is your ticket");
        }



        //the program will check if statement
        //if it's true it's execute the if statement
        //if it's false the program jumps to else and execute the body of else, the program
        //doesnt have to check the else(there is even no logic there)
        if (doesHaveLicense) {
            System.out.println("Have a safe Trip!");
        }
        else {
            System.out.println("Here is your ticket");
        }




        //if the user has a license and their speed is less than 80m/hr
        //

        boolean hasLicense = true;
        int speed = 70;


        if (hasLicense && speed < 80) {
            System.out.println("have a safe journey");
            System.out.println("Be careful it's snowing today");
        }
        //is there anything you want the program to do
        //if the if statement above is false?
        //if yes then add an else statement
        else {
            System.out.println("Give a ticket 2");
            System.out.println("Please obey the rules");
        }














    }
}
