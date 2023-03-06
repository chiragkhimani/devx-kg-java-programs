package com.java.class02;

import java.util.Scanner;

// Write down the program to print introduction about you in the output(5-8 lines).
public class FirstClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[5];
        System.out.println("Please enter five numbers");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }


    }
}