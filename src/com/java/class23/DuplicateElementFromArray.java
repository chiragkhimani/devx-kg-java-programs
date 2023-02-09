package com.java.class23;

import java.util.Scanner;

public class DuplicateElementFromArray {
    public static void main(String[] args) {
        String fruits[] = new String[8];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 8 fruits");

        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = input.next().trim();
        }

        System.out.println("Duplicate Fruits Are: ");
        for (int i = 0; i < fruits.length; i++) {
            for (int j = i + 1; j < fruits.length;j++) {
                if(fruits[i].equals(fruits[j])){
                    System.out.println(fruits[i]);
                    break;
                }
            }
        }


    }
}
