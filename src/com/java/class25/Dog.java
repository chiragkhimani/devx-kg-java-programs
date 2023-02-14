package com.java.class25;

public class Dog {
    String name;
    int age;
    char gender;

    Dog(String nameFrmUser, int ageFromUser){
        name = nameFrmUser;
        age = ageFromUser;
    }

    Dog(){

    }

    void bark() {
        System.out.println(name + " is barking");
    }

    void play() {
        System.out.println(name + " is playing");
    }
}
