package com.java.class6;

//must have to be able to use Scanner
//import statement is a statement that tell our class to use functionalities
//from different packages.
import java.util.Scanner;

public class ScannerPractice {

    //compiling a code => checking if we are matching all syntax rules
    public static void main(String[] args) {

        //before you can use scanner you have to have import statement
        //before public class line.
        Scanner input = new Scanner(System.in);

        //input.nextInt() -> will enable us to input and int data to our
        //program
        //it will allow us to enter an integer
//        input.nextInt();

//        //user can write any text you can write anything
//        input.nextLine();
//
//        //user can write any decimal value
        //I can also input int value which will be converted to a double
        //ex: 10 -> 10.0
//        input.nextDouble();
//
//
//        //users can write true or false only
//        input.nextBoolean();


       //127 is max value you can input
//        input.nextByte();



    }
}


//why i can not write in command line why I should use scanner?
//there is a way to give input before starting the program
//and there is a way to give input while the program is running(runtime) -> Scanner