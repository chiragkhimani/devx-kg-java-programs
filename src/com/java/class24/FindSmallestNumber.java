package com.java.class24;


// Write a program to find the smallest number from the array using for each loop

public class FindSmallestNumber {
    public static void main(String[] args) {
        int data[] = {43, 56, 2, 6, 78, 32};

        int min = data[0];

        for (int temp : data) {
            if (temp < min) {
                min = temp;
            }
        }
        System.out.println("Smallest = " + min);
    }
}
