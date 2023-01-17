package com.java.class14;

public class CharAt {
    //charAt(int i) -> return a character at ith index
    //hard coding means => not dynamic coding
    public static void main(String[] args) {

        String str = "wedevx.co";
        System.out.println(str.charAt(1));//e
        System.out.println(str.charAt(0));//w
        System.out.println(str.charAt(5));//x
        System.out.println(str.charAt(6));//.

        String str2 = "hello World";
        System.out.println(str2.charAt(5));//space

        String str3 = "Superstar";
        System.out.println(str3.charAt(8));//index out of bound
        //Exceptions are runtime errors
        //StringIndexOutOfBoundsException

        System.out.println(lastChar("Hawaii"));
    }

    //create a method that takes a String and returns the last character of that String.
    public  static char lastChar(String str) {
        //"United States of America" ->
        int length = str.length();//24
        return str.charAt(length-1);//24-1 = 23
    }

}
