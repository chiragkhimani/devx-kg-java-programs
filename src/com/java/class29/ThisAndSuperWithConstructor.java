package com.java.class29;

class HotDrinks {

    HotDrinks(){
        System.out.println("HotDrinks");
    }

    HotDrinks(String name){
        System.out.println(name);
    }
}

class Tea extends HotDrinks{
    Tea() {
        this("Original"); // this has to be a first statement only
        System.out.println("Prep Tea");
    }

    Tea(String flavour) {
        this("Masala", true); // this has to be a first statement only
        System.out.println("Prep Tea with flavour "+flavour);
    }

    Tea(String flavour, boolean withSugar) {
        System.out.println("Prep Tea with flavour "+flavour);
    }
}

public class ThisAndSuperWithConstructor {
    public static void main(String[] args) {
        Tea tea = new Tea();
    }
}
