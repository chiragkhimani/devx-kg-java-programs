package com.java.class21;

// What will be the output of the program?

public class NestedForLoopProgram7 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

    }
}
