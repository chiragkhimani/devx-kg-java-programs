package com.java.class9;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {
        //ask user for their gender in char
        //and if the user gender is M then print out -> go work hard
        // and if the user gender is F then print out -> enjoy your life
        //if the user gender input is not M or F then printout -> wrong input

        Scanner sc  = new Scanner(System.in);
        System.out.println("Please Enter your gender in char?");

        //primitive data types do not have any methods that's why they are primiteve
        //primitive => it's simple(basic)
        char gender =  sc.next().charAt(0);

        if (gender == 'M' || gender == 'm' ) {
            System.out.println("Go Work Hard");
        }
        else if (gender == 'F' || gender == 'f') {
            System.out.println("Enjoy your life");
        }
        else {
            System.out.println("Wrong input");
        }
    }
}
