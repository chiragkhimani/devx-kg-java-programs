package com.java.class29;

class Animal{
    Animal(String name){
        System.out.println("From Animal "+name);
    }
}

class Dog extends Animal{
    Dog(String name){
        super("abc");
        System.out.println("From Dog " + name);
    }
}

class Pets extends Dog{
    Pets(){
        super("Jhonty");
        System.out.println("From Pets");
    }
}

public class ConstructorChainingWithParams {
    public static void main(String[] args) {
        Pets pet = new Pets();
    }
}
