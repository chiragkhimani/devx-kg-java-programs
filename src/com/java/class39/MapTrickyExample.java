package com.java.class39;

//        Key 			Value2
//        Boiled rice    		"Raw rice", "water", "air"
//        Vegetable curry		Vegetables, salt, oil, water, spices
//        Dal			Pulses, salt, water, spices, Pulses

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTrickyExample {
    public static void main(String[] args) {

        Map<String, List<String>> foodIngredients = new HashMap<>();

        List<String> ingredientsOfBoiledRice = new ArrayList<>();
        ingredientsOfBoiledRice.add("Raw rice");
        ingredientsOfBoiledRice.add("Water");
        ingredientsOfBoiledRice.add("Air");
        foodIngredients.put("Boiled Rice", ingredientsOfBoiledRice);

        List<String> ingredientsOfCurry = new ArrayList<>();

        ingredientsOfCurry.add("Vegetable");
        ingredientsOfCurry.add("Oil");
        ingredientsOfCurry.add("Water");
        foodIngredients.put("Vegetable curry", ingredientsOfCurry);

        System.out.println(foodIngredients);

    }
}
