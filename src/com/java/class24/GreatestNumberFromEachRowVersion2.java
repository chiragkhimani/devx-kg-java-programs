package com.java.class24;

// Get 2D array from user and print greatest number from each row

import java.util.Scanner;

public class GreatestNumberFromEachRowVersion2 {
    public static void main(String[] args) {
        int data[][] = new int[3][3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < data.length; i++) {
            System.out.println("Enter data in row " + (i + 1));
            data[i][0] = input.nextInt();
            int max = data[i][0];

            for (int j = 1; j < data[i].length; j++) {
                data[i][j] = input.nextInt();
                if (data[i][j] > max) {
                    max = data[i][j];
                }
            }

            System.out.println("Greatest in row " + (i + 1) + " is " + max);

        }


    }
}
