package com.java.class6;

import java.util.Scanner;

public class ScannerPractice3 {

    public static void main(String[] args) {

        //write a program for login functionality
        //asks a user to input username
        //and password
        //if username is "best@devx.com"
        //password is "Fall2022"
        //then print out true
        //otherwise print out false

        Scanner input = new Scanner(System.in);

        System.out.println("Username:");
        String username = input.next();

        System.out.println("Password");
        String password = input.next();

        //anotherString has no functionality, except giving us a hint that we need to put another String inside ();
        boolean isLoggedIn = username.equalsIgnoreCase("best@devx.com") && password.equals("Fall2022");

        System.out.println(isLoggedIn);
        //==
        //!=
        //needs to be used with caution when using for Strings
        //you can use ==, != when only working with constant values
        //when you are taking the values from user ==, != do not work
        //like want it to.

        //for Strings the best way to compare is to use .equals()
        //every String variable has .equals(), .equalsIgnoreCase()

        //if you want to compare not equals with Strings
        // !var.equals("expectedResult");

        //equalsIgnoreCase() --> a method that compares two strings
        //it will return true regardless of the cases.
        //ex: "Askar".equalsIgnoreCase("askaR") -> return true

        //equals() -> will return true only if all characters and their cases
        //match
        //ex: "Askar".equals("askaR") -> return false
        //equals() -> good for passwords
        //equalsIgnoreCase() -> good for username





        //Homework: Scanner.
        //Write a credit landing program
        //get user input for age, creditscore, marital status

        //printout Approved: true
        //if user is older than 25
        //if user has a creditscore more than 700
        //if user is married


        //printout Approved: false
        //if any of the conditions is wrong



    }
}
