package com.java.class18;

import java.util.Locale;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
       do {
            System.out.println("Please enter first number");
            int num1 = sc.nextInt();

            System.out.println("Please enter second number");
            int num2 = sc.nextInt();

            System.out.println("Please enter operation you want to perform");
            String operation = sc.next();

            switch (operation.toLowerCase()) {
                case "add":
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "sub":
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "mul":
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "div":
                case "/":
                    System.out.println(num1 / num2);
                    break;
                default:
                    System.out.println("Please enter valid operation");
            }
            System.out.println("Would you like to do more operations?(Yes / No)");
            choice = sc.next();
        }while(choice.equalsIgnoreCase("yes"));
    }
}
