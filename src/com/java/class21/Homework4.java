package com.java.class21;

import java.util.Scanner;

//Write a program to print the greatest digit from the given number
//Example1
//      Input - 86545
//      Output - Greatest digit is 8
//Example2
//      Input - 23561
//      Output - Greatest digit is 6
public class Homework4 {
    public static void main(String[] args) {

        // 1. Input data from user and create a variables
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int max = num % 10;

        while (num > 0) {
            int lastDigit = num % 10;

            if (lastDigit > max) {
                max = lastDigit;
            }

            num = num / 10;
        }

        System.out.println(max);
    }
}
