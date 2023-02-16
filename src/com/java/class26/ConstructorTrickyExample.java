package com.java.class26;

class Demo {
    Demo() { // Constructor
        System.out.println("From Constructor");
    }

    void Demo() { // Method
        System.out.println("From Method");
    }
}

public class ConstructorTrickyExample {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.Demo();
    }
}