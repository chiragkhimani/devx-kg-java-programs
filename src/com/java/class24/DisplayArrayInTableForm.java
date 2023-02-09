package com.java.class24;

// Find out sum of each row from 2D array
// Sum of row 1 = 15
// Sum of row 2 = 14
// Sum of row 3 = 10
public class DisplayArrayInTableForm {
    public static void main(String[] args) {
        int data[][] = {
                {3, 5, 7},
                {5, 7, 2},
                {6, 3, 1}
        };

        for (int i = 0; i < data.length; i++) {
            int sum = 0;

            for (int j = 0; j < data[i].length; j++) {
                sum = sum + data[i][j];
            }

            System.out.println("Sum of row " + (i+1) + " = " + sum);

        }
    }
}
