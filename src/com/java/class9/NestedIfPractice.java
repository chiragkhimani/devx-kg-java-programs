package com.java.class9;

import java.util.Scanner;

public class NestedIfPractice {

    public static void main(String[] args) {
        // Get salary and age from user
// 1. If age is less than 18 then print you're not eligible
// 2. If age is more than or equal 18 and salary is less than 5000
// then print 'Sorry, you need work hard to get credit card'
// 3. If age is more than or equal 18 and salary is greater than
// or equal 5000 then print you're eligible
// 4. If age is more than or equal 18 and salary is greater than
// or equal to 20000 then print you'll get free credit card

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary:");
        int salary = input.nextInt();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        if (age <18)  {
            System.out.println("Sorry, you're not eligible");
        }
        else if (age>=18 && salary<5000) {
            System.out.println("Sorry, you need work hard to get credit card");
        }
        else if (age>=18 && salary>=5000 && salary<20000) {
            System.out.println("You're eligible");
        }
        else if (age>=18 && salary>=20000) {
            System.out.println("You'll get free credit card");
        }


        //code maintainability -> the code that's easy to maintain and make changes to
        if (age <18)  {
            System.out.println("Sorry, you're not eligible");
        }

        else {
            if (salary<5000) {
                System.out.println("Sorry, you need work hard to get credit card");
            }
            else if(salary>=5000 && salary<20000){
                System.out.println("You're eligible");
            }
            else {
                System.out.println("You'll get free credit card");
            }
        }


    }
}
