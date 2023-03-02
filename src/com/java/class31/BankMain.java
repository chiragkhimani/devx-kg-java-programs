package com.java.class31;

public class BankMain {
    public static void main(String[] args) {

        ChaseBank chiragCB = new ChaseBank();
        CitiBank chiragCiti = new CitiBank();

        Paypal chiragPaypal = new Paypal();

        chiragPaypal.displayRateOfInterest(chiragCB);
        chiragPaypal.displayRateOfInterest(chiragCiti);
    }
}
