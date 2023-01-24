package com.java.class16;

public class WhileLoop {


    public static void main(String[] args) {
        //what are loops?
        //In programming pretty often you need to rerun the same set of
        //code multiple times. and you need to accomplish that with
        //minimal code.


        //for: example - we want to write program that counts
        //number of active users right now.

        int activeUsers = 0;
        activeUsers++;
        System.out.println("Welcome User number " + activeUsers);
        activeUsers++;
        System.out.println("Welcome User number " + activeUsers);
        activeUsers++;
        System.out.println("Welcome User number " + activeUsers);
        activeUsers++;
        System.out.println("Welcome User number " + activeUsers);
        activeUsers++;
        System.out.println("Welcome User number " + activeUsers);
        activeUsers++;
        System.out.println("Welcome User number " + activeUsers);
        activeUsers++;
        System.out.println("Welcome User number " + activeUsers);
        activeUsers++;
        System.out.println("Welcome User number " + activeUsers);
        activeUsers++;
        System.out.println("Welcome User number " + activeUsers);
        activeUsers++;
        System.out.println("Welcome User number " + activeUsers);

        //() -> boolean expression
        //while boolean expression is true
//        while () {
//            //body
//            //in the body
//            //you must a have boolean expression updater
//            //otherwise you might have an infinite loop.
//        }


        int activeU = 0;
        //if you are dealing with counters
        //you boolean expressions are going to be
        //< comparison operator
        while (activeU < 10){
            activeU++;
            System.out.println("Welcome User number " + activeU);
        }









    }


     //reuse the same logic is for methods.
}
