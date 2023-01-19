package com.java.class15;

public class IndexOfSubstringPractice {

    public static void main(String[] args) {
        String str = "I 5am love waking up  at ";
        //check for the length of this String.
        //3

        int length = "5am".length();
        int indexOf5am = str.indexOf("5am");
        System.out.println(indexOf5am);
        System.out.println(length);
        System.out.println(length+indexOf5am);

        System.out.println(str.substring(indexOf5am, indexOf5am+length));
    }
}
