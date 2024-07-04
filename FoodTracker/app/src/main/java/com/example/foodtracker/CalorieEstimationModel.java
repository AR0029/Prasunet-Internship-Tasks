package com.example.foodtracker;

public class CalorieEstimationModel {
    private Map<String, Double> calorieMap;


    public CalorieEstimationModel() {

        calorieMap = new HashMap<>();

        // Initialize calorie map with food items and their corresponding calorie values

        calorieMap.put("Apple", 95.0);

        calorieMap.put("Banana", 105.0);

        // ...

    }


    public double estimateCalories(String foodItem) {

        return calorieMap.getOrDefault(foodItem, 0.0);

    }
}
