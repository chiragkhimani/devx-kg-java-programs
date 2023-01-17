package com.java.class6;

public class ConditionalOR {

    public static void main(String[] args) {

        //Conditional OR ||
        //is used for setting multiple conditions
        //and overall result is true  if at least one of them is true.

        //ex: I want to give discounts to multiple group of people
        //if you are older than 60
        //if you are younger than 8

        int age = 61;

        boolean giveDiscount = age > 60 || age < 8;
        System.out.println(giveDiscount);

        //difference between && -> all conditions must true
        //|| -> at least one of them must true



        //if 24 hr time

        int currentTime=10;

        //drink coffee should be true if current time is 6-11.
        boolean drinkCoffee = currentTime > 6 && currentTime < 11;

        System.out.println(drinkCoffee);






        //tell me when I can start to relax
        //when you completed 5 or more java exercises
        // or when you recorded 2 or more soft-skills videos.

        int howManyJavaExercises = 0;
        int howManySoftSkillsVideos = 3;

        boolean canIrelaxNow = howManyJavaExercises >= 5 || howManySoftSkillsVideos >= 2;
        System.out.println(canIrelaxNow);



        /////////
        //int any comparison you have expectedValue(comes from requiments)
        //actualValue (comes from users)




        ///Banking industry application
        //when should the bank account be blocked?
        //loginAttempts more than 3
        //transaction amount is more than $3000
        //location of transaction -> must match your current location



        int numberOfLoginAttempts = 0;
        double transactionAmount = 10.0;
        String locationOfTransaction = "Ecuador";//==, !=


        boolean block = numberOfLoginAttempts > 3 || transactionAmount > 3000.0 || locationOfTransaction != "USA";

        //block = false;
        System.out.println(block);

        /////
        //you store text in  a String data type
        //you can only compare strings with ==, !=
        //you can not do >, <, >=, <=


        //Login Functionality
        //Write a logic which would tell the user if logged in or not
        //you have a username
        //you have a password
        //you loginLocation

        //in order to be logged your userName should match steve@apple.com
        //and your password should be infinityLoop1
        //and you location should be california


        boolean logIn = true;

    }
}
