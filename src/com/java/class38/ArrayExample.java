package com.java.class38;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary[] = new int[5]; // Fixed length

        System.out.println("Please enter your salaries");
        for (int i = 0; i < salary.length; i++) {
            salary[i] = sc.nextInt();
        }
    }
}
