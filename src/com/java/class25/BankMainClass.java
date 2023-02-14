package com.java.class25;

public class BankMainClass {
    public static void main(String[] args) {
        Bank tairaAccount = new Bank();
        Bank zarinaAccount = new Bank();

        tairaAccount.balance = 1000;
        tairaAccount.accName = "Taira";

        zarinaAccount.balance = 5000;
        zarinaAccount.accName = "Zarina";

        tairaAccount.withdraw(6000000);
        System.out.println(tairaAccount.balance);

        System.out.println(zarinaAccount.balance);


    }
}
