package com.java.class27;

class Car{
    int speed = 200; // Instance
    static int price = 600;

    void drive(){
        int speed = 100; // Local
        System.out.println(speed);
    }
}

public class StaticExample{
    public static void main(String []args){
        Car c = new Car();
        System.out.println(c.speed); // 200
       // System.out.println(Car.speed); // Error
        System.out.println(Car.price); // 600
        System.out.println(c.price); //  600
    }
}
