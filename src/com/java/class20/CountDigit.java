package com.java.class20;

import java.util.Scanner;

// Write a program to count number of digit in the given number

// Input - 35435 / 10 = 3543
// Output - 5

public class CountDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");

        long num = input.nextLong();
        int count = 0;

        while (num > 0) {
            num = num / 10; // remove one digit from number
            count++;
        }

        System.out.println(count);

    }
}
