package com.java.class39;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Write a program to get five numbers from the user and print reverse sequence of it
public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        // Take data from user
        System.out.println("Enter five numbers");
        for (int i = 0; i < 5; i++) {
            numbers.add(sc.nextInt());
        }

        // Sort the data and print
        Collections.reverse(numbers);
        System.out.println(numbers);
    }
}
