package com.java.class21;

// How many times it will print Hello?

public class NestedForLoopProgram1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for(int s=1; s<=5-i; s++){
                System.out.println("Hello");
            }

        }

    }
}
