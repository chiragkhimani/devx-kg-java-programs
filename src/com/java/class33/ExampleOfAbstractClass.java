package com.java.class33;

abstract class Bank {

    int balance;


    Bank() {

    }

    public abstract void displayRateOfInterest(); // Abstract method

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}

class CitiBank extends Bank {
    @Override
    public void displayRateOfInterest() {

    }
}


public class ExampleOfAbstractClass {
    public static void main(String[] args) {
        //Bank b = new Bank(); // We cannot create object of abstract class
        //b .displayRateOfInterest();
    }
}
