package com.java.class37;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PurposeOfException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your browser");
        String browser = sc.nextLine();

        if (browser.equals("firefox")) {
            System.out.println("Opening firefox");
        } else if (browser.equals("chrome")) {
            System.out.println("Opening chrome");
        } else {
            throw new InputMismatchException("Invalid input");
        }

        System.out.println("Opening login page");
        System.out.println("Doing login");
        System.out.println("Verifying homepage");
        System.out.println("Closing the browser");
    }
}
