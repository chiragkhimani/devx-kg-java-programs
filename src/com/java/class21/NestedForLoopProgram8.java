package com.java.class21;

public class NestedForLoopProgram8 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for(int s=1; s<=5-i; s++){
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

    }
}
