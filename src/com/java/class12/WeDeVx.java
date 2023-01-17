package com.java.class12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeDeVx {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line1;
        String line2;

        double total = 0;

        if ((line1 = reader.readLine()) != null) {
            total = Double.parseDouble(line1);
        }

        double cashReceived = 0;

        if ((line2 = reader.readLine()) != null) {
            cashReceived = Double.parseDouble(line2);
        }

        System.out.println(Solution.cashier(total, cashReceived));
    }
}


class Solution {
    public static double cashier(double total, double cashReceived) {
        return total - cashReceived;
    }
}

