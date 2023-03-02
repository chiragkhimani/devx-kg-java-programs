package com.java.class30;

class Car{
    void playMusic(){
        System.out.println("Playing music");
    }

    void drive(){
        System.out.println("Driving at speed of 100");
    }
}

class SportsCar extends Car{
    void drive(){
        System.out.println("Driving at speed of 180");
    }
}
public class MethodOverridingExample {
    public static void main(String[] args) {
        Car c = new Car();
        SportsCar sc = new SportsCar();
        sc.playMusic();
        c.drive();
        sc.drive();
    }
}
