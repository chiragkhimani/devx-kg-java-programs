package com.java.class30;

class Bank1{

    void displayRateOfInterest(){
        System.out.println("6.0 %");
    }

    void withdraw(int amount){

    }

    void deposit(int amount){

    }
}

class OptimaBank extends Bank1{
    @Override
    void displayRateOfInterest(){
        System.out.println("8.0 %");
    }
}

class KICBBank extends Bank1{
    @Override
    void displayRateOfInterest(){
        System.out.println("7.0 %");
    }
}

public class MethodOverridngExample1 {
    public static void main(String []args){
        OptimaBank ob = new OptimaBank();
        KICBBank kb = new KICBBank();
        ob.displayRateOfInterest(); // 8
        kb.displayRateOfInterest(); // 7
    }
}
