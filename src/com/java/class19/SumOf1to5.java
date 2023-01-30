package com.java.class19;

// 1 + 2 + 3 + 4 + 5
public class SumOf1to5 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
