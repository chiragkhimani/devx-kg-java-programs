package com.java.class31;

class Bank {
    void withdraw() {
        System.out.println("Parent Withdraw");
    }

    void deposit() {
        System.out.println("Parent deposit");
    }

    void displayRateOfInterest(){
        System.out.println("Parent rate of interest");
    }
}

class ChaseBank extends Bank{
    @Override
    void displayRateOfInterest(){
        System.out.println("Child rate of interest - ChaseBank");
    }

    void takeQuickLoan(){
        System.out.println("Child Take quick loan");
    }
}

class CitiBank extends Bank {
    @Override
    void displayRateOfInterest() {
        System.out.println("Child rate of interest - CitiBank");
    }
}
