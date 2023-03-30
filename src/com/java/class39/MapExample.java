package com.java.class39;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> ageOfPeople = new HashMap<>();

        ageOfPeople.put("Dana", 43);
        ageOfPeople.put("Azat", 34);
        ageOfPeople.put("Aidai", 34);
        ageOfPeople.put("Taira", 34);
        ageOfPeople.put("Madina", 34);
        ageOfPeople.put("Dana", 34);

        System.out.println(ageOfPeople);
        System.out.println(ageOfPeople.get("Madina"));
        System.out.println(ageOfPeople.size());
        System.out.println(ageOfPeople.isEmpty());
        System.out.println(ageOfPeople.containsKey("Dana"));
        System.out.println(ageOfPeople.containsValue(43));
    }
}
