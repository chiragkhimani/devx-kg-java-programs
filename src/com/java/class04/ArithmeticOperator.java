package com.java.class04;

public class ArithmeticOperator {
    public static void main(String[] args) {
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(20 / 10);

        // Modulo
        System.out.println(14 % 10);

        System.out.println(13 % 5);

        System.out.println(42 % 3);

        // When we do modulo with 2 we can check if given number is odd or even
        System.out.println(31 % 2); // 1
        System.out.println(12 % 2); // 0
        System.out.println(47 % 2); // 1
        System.out.println(8 % 2);  // 0

        // When we do modulo with 10 of the number
        // then we will get last digit from the number
        System.out.println(31 % 10); // 1
        System.out.println(12 % 10); // 2
        System.out.println(47 % 10); // 7
        System.out.println(8 % 10);  // 8

        // When we divide number by 10 then we will get number without last digit in the answer
        System.out.println(31 / 10);  // 3
        System.out.println(8 / 10);  // 0
        System.out.println(12 / 10); // 1
        System.out.println(47 / 10); // 4
        System.out.println(127 / 10); // 12
        System.out.println(472 / 10);// 47


    }
}
