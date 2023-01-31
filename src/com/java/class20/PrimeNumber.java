package com.java.class20;

import java.util.Scanner;

// Any number that are divisible by 1 and itself called prime number
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = input.nextInt();

        int count = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if(count == 0){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
