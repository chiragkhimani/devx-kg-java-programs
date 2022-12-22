package com.java.class8;

import java.util.Scanner;

public class GreaterSalaryIfElsePractice {

    public static void main(String[] args) {
        /**
         * Write a program to get the salaries of two-people
         * and print the name of the person that has a greater salary
         * Question Type: Write Code.
         *
         * Test Data:
         * Example 1
         * Person 1: 1200
         * Person 2: 2500
         * Output: 2500
         *
         * Example 2:
         * Person 1: 4500
         * Person 2: 8600
         * Output: 8600
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Person 1 salary");
        double salary1 = input.nextDouble();

        System.out.println("Please Enter Person 2 salary");
        double salary2 = input.nextDouble();

        if (salary1 > salary2) {
            System.out.println(salary1);
        }
        else  {
            System.out.println(salary2);
        }



    }
}
