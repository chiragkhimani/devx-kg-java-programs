package com.java.class37;

import java.util.Scanner;

public class Teenagers {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age > 100 || age <= 0) {
            throw new InterruptedException("Invalid Age Specified");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else {
            System.out.println("Not Teenager");
        }


    }
}
