package com.java.class22;

// Write a program to print sum of data stored in the array

import java.util.Scanner;

public class FindIndexOfNumber {
    public static void main(String[] args) {
        // Declaration of Array
        int listOfData[] = new int[8];

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 8 numbers");

        // Getting the numbers from user
        for(int i=0; i<listOfData.length; i++){
            listOfData[i] = input.nextInt();
        }

        System.out.println("Please enter target number we need find index ");
        int targetNumber = input.nextInt();

        for (int i = 0; i < listOfData.length; i++) {
            if (listOfData[i] == targetNumber) {
                System.out.println(i);
            }
        }


    }
}
