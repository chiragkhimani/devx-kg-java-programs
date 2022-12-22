package com.java.class8;

import java.util.Scanner;

public class NumberOfDaysInEachMonth {
    //Write a program to take a month number from the user
    // and print the number of days in a given month

    //if user enter a number outside of 1 and 12 print out
    //wrong entry. You can only input a number between 1 and 12. Please try again!


    //ex 1:
    //Please enter the month in number
    //input: 1
    //output: 31


    //ex 2:
    //Please enter the month in number
    //input: 6
    //output: 30

    //ex 3:
    //Please enter the month in number
    //input: 2
    //output: 28 or 29


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the month in number");

        int monthNumber = input.nextInt();

        if (monthNumber == 1) {
            System.out.println(" 31 days");
        }
        else if (monthNumber == 2) {
            System.out.println("Feburary has 28 or 29 days");
        }
        else if (monthNumber == 3) {
            System.out.println("31 days");
        }
        else if (monthNumber == 4) {
            System.out.println("March has 30 days");
        }
        else if (monthNumber == 5) {
            System.out.println(" 31 days");
        }
        else if (monthNumber == 6) {
            System.out.println("June has 30 days");
        }
        else if (monthNumber == 7) {
            System.out.println(" 31 days");
        }
        else if (monthNumber == 8) {
            System.out.println("August has 31 days");
        }
        else if (monthNumber == 9) {
            System.out.println("September has 30 days");
        }
        else if (monthNumber == 10) {
            System.out.println("October has 31 days");
        }
        else if (monthNumber == 11) {
            System.out.println("November has 30 days");
        }
        else if (monthNumber == 12) {
            System.out.println("December has 31 days");
        }
        //not always, but usually else is used to handle error messages.
        else {
            System.out.println("Wrong Entry only numbers 1-12 are allowed, please try again.");
        }



        if (monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 || monthNumber ==8 || monthNumber == 10 || monthNumber == 12) {
            System.out.println("31 days");
        }
        else if(monthNumber == 4 || monthNumber == 6 || monthNumber ==  9 || monthNumber == 11) {
            System.out.println("30 days");
        }
        else if (monthNumber == 2) {
            System.out.println("28 or 29 days");
        }
        else {
            System.out.println("Wrong Entry");
        }
    }
}
