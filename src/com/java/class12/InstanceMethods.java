package com.java.class12;

//What is an Object? -> Object is an Instance of a class.
//Instance of a class is created by using new keyword.

//What is a static method?
//static methods are predefined functions
//that can be used without creating an Object.

//What is a non-static method?
//Non-static method is an instance method.
//In order to use instance methods inside a static
//method you must first create an object of the class
//where the instance method is defined.
public class InstanceMethods {

    public static void main(String[] args) {
        print();

        InstanceMethods someVarName = new InstanceMethods();
        someVarName.print1();
    }

    public static void print() {
        System.out.println("Hello");
    }

    public void print1() {
        System.out.println("Hello");
    }



}
