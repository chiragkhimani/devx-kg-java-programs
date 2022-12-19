package com.java.class7;

public class TypeCasting {

    /**
     * Type of errors in Java?
     * 1. Compilation error -> is the error that happens before running the program(compiling the program). It prevents the program from running.
     *
     * 2. Runtime Error -> type of error that happens while your program is already running. (your program will crush)
     * @param args
     */


    //incompatible means -> not supported. things that dont fit each other
    //2 problems - 1) Trying to put decimal pointed numbers into whole number data types.
    //2) when trying to push in bigger data types into smaller.


        public static void main(String[] args) {

            double gasPrice = 1.99;
           // int wholeNumber = gasPrice; //incompatible types compilation error

            //int b = 10.5; //incompatible types compilation error

            int a = 40;
           // short smallNum = a; //incompatible types compilation error


            //explicit type casting -> manual
            double price = 2.99;
            //(int) is a type casting operator
            int convert = (int)price;
            System.out.println(convert);


            double num2 = 9.01;
            int convert2 = (int)num2;
            System.out.println(num2);


            float floatNum = 2.44545566767676767676767676767676f;
            //covert floatNum into a byte
            //and print out byte number.
            byte convert3 = (byte)floatNum;
            System.out.println(convert3);


            //implicit -> automatic casting
            int num1 = 24;
            double doubleNum = num1; //automatically adds .0 at the end
            System.out.println(doubleNum); //24.0


            int num5= 55;
            double doubleNum2 = num5;
            System.out.println(doubleNum2);


            //I want get Average customer Spending on my products
            //I sold $4,544,950.96
            //64 - clients
            //find what is the average customer spending
            System.out.println("---Average Spending---");
            double sold = 4544950.96;
            int clients = 64;

            //whenever you have a double and int in one math expression
            //you should have a double a result
            //implicit casting
            double average = sold/clients;
            System.out.println(average);


            //I drove 100 miles
            //gallons of gas = 2.4;
            //how many miles per gallon did I drive
            System.out.println("--Miles per gallon --");
            int miles =100;
            double gallons = 2.4;
            double milesPerGallon = miles/gallons;
            System.out.println(milesPerGallon);





































        }
}
