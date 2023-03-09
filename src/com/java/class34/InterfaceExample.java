package com.java.class34;

interface Bank {

    public static final int num = 10;

    void displayRateOfInterest();

    void withdraw(int amount);

    void deposit(int amount);
}

interface InternationalBank extends Bank {
    void displayRateOfInterest();
}

class CitiBank implements InternationalBank {

    @Override
    public void displayRateOfInterest() {

    }

    @Override
    public void withdraw(int amount) {

    }

    @Override
    public void deposit(int amount) {

    }

}

class ChaseBank implements Bank {

    @Override
    public void displayRateOfInterest() {

    }

    @Override
    public void withdraw(int amount) {

    }

    @Override
    public void deposit(int amount) {

    }
}


public class InterfaceExample {
    public static void main(String[] args) {

    }
}
