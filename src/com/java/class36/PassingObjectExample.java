package com.java.class36;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class PassingObjectExample {
    public static void main(String[] args) {
        Person aizhan = new Person("Aizhan", 17);
        Person dana = new Person("Dana", 45);
        Person madina = new Person("Madina", 2);

        printObjectData(aizhan);
        printObjectData(dana);
        printObjectData(madina);
    }

    public static void printObjectData(Person per) {
        System.out.println(per.name);
        System.out.println(per.age);
    }
}
