package com.java.class03;

// This is our class and the class name is - IdentifierExample
public class IdentifierExample {

    public static void main(String[] args) {
        // Syntax for the variable
        // data_type variable_name = value;
        // In the example we have
        // data type = byte,
        // mySum = variable name
        // value = 127

        byte num1 = 127; //  1 byte
        short num2 = 343; // 2 bytes
        int num3 = 2147483647;     // 4 bytes
        long num4 = 456454; // 8 bytes
        float num5 = 35345.343f;
        double num6 = 4354.2332;
        String name = "Chirag Khimani";
        char gender = 'm';
        boolean answer = false;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(name);
        System.out.println(gender);
        System.out.println(answer);
    }

}
