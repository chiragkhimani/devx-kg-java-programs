package com.java.class8;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        /**> **Write a program to take a number from the user
         * and check whether given number is odd or even
         even numbers are the numbers that are divisible by 2 -> 2,4,6,8,10
         odd numbers are not divisible by 2 -  1,3,5,7,9,11
         **Question Type:** Write Code.

         ## Test Data:
         Example 1

         Input: 43
         Output: 43 is an odd number

         Example 2:
         Input: 74
         Output: 74 is an even number
         **/


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a whole number");

        int num = input.nextInt();
        //when I divide the number by 2 and there is no remainder then that number is
        //an even number.

        //when I divide the number by 2 and there is a remainer that number is odd.
        if (num % 2 == 0) {
            System.out.println(num + " is an even number");
        }
        else  {
            System.out.println(num + " is an odd number");
        }




    }
}
