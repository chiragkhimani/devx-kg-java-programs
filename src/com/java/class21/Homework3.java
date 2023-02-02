package com.java.class21;

import java.util.Scanner;

// Write a program to print the sum of each digit from the given number
//Example1
//  Input - 3521
//  Output - 11
//Example2
//  Input - 5390
//  Output - 17
public class Homework3 {
    public static void main(String[] args) {

        // 1. Input data from user and create a variables
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int sum = 0;

        while(num > 0) {
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }

        System.out.println(sum);
    }
}
