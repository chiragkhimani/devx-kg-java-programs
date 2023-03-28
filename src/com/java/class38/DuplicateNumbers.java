package com.java.class38;

import java.util.HashSet;
import java.util.Set;

// Find duplicate characters in the String
public class DuplicateNumbers {
    public static void main(String[] args) {
        String str = "We are almost finishing java";

        Set<Character> setOfChar = new HashSet<>();
        Set<Character> setOfDuplicateChar = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            if (setOfChar.add(str.charAt(i)) == false) {
                setOfDuplicateChar.add(str.charAt(i));
            }
        }

        System.out.println(setOfDuplicateChar);
    }
}
