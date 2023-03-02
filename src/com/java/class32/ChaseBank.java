package com.java.class32;


public class ChaseBank {
    protected static int balance;

    protected static void withdraw(int amount) {
        balance = balance - amount;
    }

    protected static void deposit(int amount) {
        balance = balance + amount;
    }
}

class PurposeAccessModifier {
    public static void main(String[] args) {
        ChaseBank cb = new ChaseBank();
        cb.deposit(5000);
        cb.balance = 900000000;

    }
}
