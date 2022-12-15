package com.java.class6;


import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //nextInt(), nextLine(), nextBoolean() -> they are all
        //methods
        //all methods return a result. make sure you know what data type y
        //the method returns

        //before we ask for user input we should tell the user
        //what type of info we want from them

        System.out.println("Please Enter your age and hit Enter");
        int age = input.nextInt();
        System.out.println("Your age is " + age);

        System.out.println("Please enter your credit score between 0-820");
        int creditScore = input.nextInt();
        System.out.println("Your Credit Score is "+ creditScore);

        //ask a user their marital status
        //married, single
        //true, false
//        System.out.println("Please enter your marital status. Write true if married falase if single");
//        boolean isMarried = input.nextBoolean();
//        System.out.println("is married? " + isMarried);

        System.out.println("Please enter your marital status. Write married or single");
        String maritalStatus = input.next();
        System.out.println(maritalStatus);


        //input.next() -> takes only one word(the text until the first space)
        //input.nextLine() -> takes full line of text



    }
}
