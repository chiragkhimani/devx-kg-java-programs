package com.java.class29;


class Bank{
    void displayRateOfInterest(){
        System.out.println("4.0%");
    }
}

class ChaseBank extends Bank{
    void displayRateOfInterest(){
        System.out.println("6.0%");
       super.displayRateOfInterest();
    }
}

public class ThisAndSuperWithMethods {
    public static void main(String[] args) {
        ChaseBank cb = new ChaseBank();
        cb.displayRateOfInterest();
    }
}
