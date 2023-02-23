package com.java.class29;

class Parent {
    String name = "Azat";
}

class Child extends Parent{
    String name = "Chirag";

    void printName(){
        String name = "Maxim";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}

public class ThisAndSuperWithVariables {
    public static void main(String[] args) {
        Child c = new Child();
        c.printName();
    }
}
