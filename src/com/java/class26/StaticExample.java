package com.java.class26;

class Car {
    static int price;

    Car() {
        price++;
    }
}

public class StaticExample {
    public static void main(String[] args) {
        System.out.println(Car.price);
    }
}
