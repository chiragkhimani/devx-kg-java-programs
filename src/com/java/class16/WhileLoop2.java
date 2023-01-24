package com.java.class16;

public class WhileLoop2 {

    public static void main(String[] args) {
        //write a program
        //that will print out
        //*
        //**
        //***
        //****
        //*****
        String str = "*";
        int iterator = 0;
        while (iterator < 5) {
            System.out.println(str);
            str = str.concat("*");
            iterator++;
        }

        String str2 = "";
        while (str2.length() < 5) {
            //you must have a statement
            //that updates the value of a variable that
            //is used in boolean expression
            str2 = str2.concat("*");
            System.out.println(str2);
        }




        //write a program
        //that prints out
        //10-0
        //10
        //9
        //8
        //7
        //6
        //...
        //0
        int number = 10;
        while (number >= 0 ) {
            System.out.println(number);
            number--;
        }






        //write a program that prints out
        //*****
        //****
        //***
        //**
        //*

        //how to print 1 less character in a String? -> substring
        //substring(0, str.length()-4)
        String str10 = "*****";

        while (str10.length() > 0) {
            System.out.println(str10);
            str10 = str10.substring(0,str10.length()-1);
        }

        //write a program that will
        //print out even numbers until 20
        //2-4-6-8-10-12-14-16-18-20
        int num1 = 0;
        while (num1 < 20) {
            num1+=2;
            System.out.println(num1);
        }


        int num2 = 0;

        while (num2 <= 20) {
            if (num2%2 ==0) {
                System.out.println(num2);
            }
            num2++;
        }

// space complexity =>
// time complexity  =>
// big annotation   =>




        //Write a program
        //that will count number of vowel characters and
        //and consonant characters in a String

        //String str = "Hello DevXer";
        //4 - vowels
        //8 - consonants including the space



























    }
}
