package com.java.class02;

import java.util.Scanner;

// Write down the program to print introduction about you in the output(5-8 lines).
public class FirstClass {
    public static void main(String[] args) {
        // Create object of Scanner class
        Scanner input = new Scanner(System.in);

        // Variable Declaration
        int salary;
        double incomeTax;

        // Take data from user
        System.out.println("Enter your salary");
        salary = input.nextInt();

        if (salary <= 3000) {
            incomeTax = 0;
        } else if (salary <= 6000) {
            incomeTax = (salary - 3000) * 0.05;
        } else if (salary <= 9000) {
            incomeTax = (salary - 6000) * 0.1 + 3000 * 0.05;
        } else if (salary <= 12000) {
            incomeTax = (salary - 9000) * 0.15 + 3000 * 0.1 + 3000 * 0.05;
        } else if (salary <= 15000) {
            incomeTax = (salary - 12000) * 0.2 + 3000 * 0.15 + 3000 * 0.1 + 3000 * 0.05;
        } else {
            incomeTax = (salary - 15000) * 0.3 + 3000 * 0.2 + 3000 * 0.15 + 3000 * 0.1 + 3000 * 0.05;
        }

        System.out.println("Your total income tax is " + incomeTax);

    }
}