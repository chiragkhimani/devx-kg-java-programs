package com.java.class04;

import java.util.Scanner;

public class ExpressionExample {

    public static void main(String[] args) {
        // Create object of Scanner class
        Scanner input = new Scanner(System.in);

        // Variable Declaration
        int megabytes;

        // Take data from user
        System.out.println("Enter value in megabytes");
        megabytes = input.nextInt();

        System.out.println("Value in kilobytes : " + megabytes * 1024);
    }
}
