package com.java.class8;


/**
 * 3. Write a program to print a welcome message to the passenger and
 * notify them to do security checks if they are not coming from connecting flight,
 *  and at the end print "enjoy your flight"
 * Example 1:
 * Welcome to the Delta Air Lines
 * Are you travelling from connecting flight(true/false)? true
 * Enjoy your flight
 * Example 2:
 * Welcome to the Delta Air Lines
 * Are you travelling from connecting flight(true/false)? false
 * Please proceed to the security check
 * Enjoy your flight
 */
public class FlightProgram {

    public static void main(String[] args) {
        //! - negating sign only works with booleans
        //it's very useful in if statments
        //where you want to execute the logic only when
        //condition is negative
        System.out.println(!true);


        boolean doesHaveDriveLicense = false;

        if (!doesHaveDriveLicense) {
            System.out.println("Give ticket");
        }

    }
}
