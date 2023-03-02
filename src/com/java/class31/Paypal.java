package com.java.class31;
// PayPal will have to create different methods for bank to take object of each bank
// as an argument, so if we have 100 banks, we need to create 100 different methods for
// each bank to support one feature.

// Instead we can take reference of parent class so we can store object of any child class
// so we don't need to create method for each child class separately
public class Paypal {
    void displayRateOfInterest(Bank bank){
        bank.displayRateOfInterest();
    }
}
