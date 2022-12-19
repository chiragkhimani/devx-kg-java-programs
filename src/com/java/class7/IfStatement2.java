package com.java.class7;

import java.util.Scanner;

public class IfStatement2 {


    public static void main(String[] args) {

        //take age from user
//        Scanner input = new Scanner(System.in);

        //write a program that tells me if I am eligible to drive
        int age = 18;

        //print out you are eligible to drive for people older than 16
        if (age > 16) {
            System.out.println("You are Eligible to Drive");
        }

        if (age <= 16) {
            System.out.println("You are too Young");
        }


        //Write a program that asks the user for weather in fahrenheit
        //if the weather is less than 32 than print out it's Freezing. Stay Home
        //if weather is more or equal to 32 and less than 41 than print out -> it's little chilly outside
        //if weather is more than or equal to 42 and less 68 -> print out -> it's a good weather outside. Go get some Fresh air.
        //if weather is more than or equal to 68 -> print out it's amazing outside. let's go to pool and vitamin D.

        Scanner input = new Scanner(System.in);

        System.out.println("What the weather like?");
        int weather = input.nextInt();

        if (weather < 32) {
            System.out.println("it's freezing outside! Stay home");
        }

        if (weather >= 32 && weather < 42) {
            System.out.println("it's little chilly outside");
        }

        if (weather >= 42 && weather < 68) {
            System.out.println("it's a good weather outside. Go get some Fresh air.");
        }

        if (weather >= 68) {
            System.out.println("it's amazing outside. let's go to pool and vitamin D.");
        }


    }
}
