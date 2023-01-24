package com.java.class17;

public class WhileLoopPractice2 {
    public static void main(String[] args) {

        //Write a program to print out all character in a String
        String str = "Let's go Mars";
        //do I know how many times my loop should be iterated?

        int startingIndex = 0;

        //if you need to increment then use var < how many time you need to run
        while (startingIndex < 13 ) {
            char eachChar = str.charAt(startingIndex);
            System.out.println(eachChar);
            startingIndex++;
        }

        //1. define the right starting point
        //2. define a boolean expression where
        // you are using the variable of starting point
        //3. write body of the while loop.
        //4. make sure you have an updater of a variable in the boolean expression

        //write a program that prints the all characters of a String
        //in reverse order
        //ex: Java
        //avaJ
        //Lambo -> obaml
        //obama -> amabo
        //DevX -> XveD

        System.out.println("------");
        String str2 = "SpaceX Mars Mission";
        //whenever you are working with charAt();
        //indexes -> index starts from 0
        int index = str2.length()-1;
        System.out.println(index);

        while(index >= 0) {
            System.out.println(str2.charAt(index));
            index--;
        }
//        System.out.println(str2.charAt(4));
//        System.out.println(str2.charAt(3));
//        System.out.println(str2.charAt(2));
//        System.out.println(str2.charAt(1));
//        System.out.println(str2.charAt(0));








    }
}
