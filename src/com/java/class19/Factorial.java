package com.java.class19;

//     Write a program to find result of below series
//        1 * 2 * 3 * 4 * 5

public class Factorial {
    public static void main(String[] args) {
        int sum = 1;

        for (int i = 1; i <= 5; i++) {
            sum = sum * i;
        }

        System.out.println(sum);
    }
}
