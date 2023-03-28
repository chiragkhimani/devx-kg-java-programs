package com.java.class38;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> listOfNum = new ArrayList<>();

        // Store data into the list
        listOfNum.add(40);
        listOfNum.add(34);
        listOfNum.add(65);
        listOfNum.add(32);
        listOfNum.add(2, 50);

        System.out.println(listOfNum);

        // Get data from the list
        for (int i = 0; i < listOfNum.size(); i++) {
            System.out.println(listOfNum.get(i));
        }

        for (int data : listOfNum) {
            System.out.println(data);
        }
    }
}
