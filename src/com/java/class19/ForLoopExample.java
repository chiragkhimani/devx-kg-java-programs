package com.java.class19;

public class ForLoopExample {
    public static void main(String[] args) {
        int i = 1; // initialization

        while (i <= 5) { // Condition
            System.out.println(i);
            i++; // Increment / Decrement
        }

        for (int j = 1; j <= 5; j++) {
            System.out.println(j);
        }

        for (int j = 10; j >= 1; j--) {
            System.out.println(j);
        }

    }
}
