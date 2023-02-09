package com.java.class24;

public class ForEachLoop {
    public static void main(String[] args) {
        int data[] = {43, 56, 2, 6, 78, 32};

        System.out.println("Print using index based for loop");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        System.out.println("Print using for each loop");
        for (int temp : data) {
            System.out.println(temp);
        }

    }
}
