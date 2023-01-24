package com.java.class17;

public class WhileLoopPractice4 {

    public static void main(String[] args) {
        //write program that prints out
        //every other character of a String

        //ex: Java
        //a a
        //Hello
        //e l
        //World
        //o l
        //Mission Impossible
        //i s o  m o s i l

        String str = "Hello World from Mars";

        int i = 1;

        while (i < str.length()) {
            System.out.println(str.charAt(i));
            i+=2;
        }
    }
}
