package com.java.class39;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Write a program to print unique words from the Given String
// Input - well, collection is very easiest topic in java and it is very useful as well
// Output - collection easiest topic in java and it useful as
public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> setOfWords = new HashSet<>();

        // Take data from user
        System.out.println("Enter any String");
        String str = sc.nextLine().replace(",", "");

        // Split String by space to get collection of words
        String[] arrayOfWords = str.split(" ");

        // Add each word from array to set & if it is duplicate, remove that word from set
        for (int i = 0; i < arrayOfWords.length; i++) {
            if (!setOfWords.add(arrayOfWords[i])) {
                setOfWords.remove(arrayOfWords[i]);
            }
        }
        System.out.println(setOfWords);
    }
}
