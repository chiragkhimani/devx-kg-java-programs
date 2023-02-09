package com.java.class23;

public class LengthOfArray {
    public static void main(String[] args) {
        int listOfNum[] = new int[10];

        listOfNum[0] = 10;
        listOfNum[1] = 20;
        listOfNum[2] = 30;

        System.out.println(listOfNum.length);

        for(int i=0; i <= listOfNum.length; i++){
            System.out.println(listOfNum[i]);
        }
    }
}
