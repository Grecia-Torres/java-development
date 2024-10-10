package com.pluralsight.week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsExercise {
    public static void main(String[] args) {
        favoriteFruits();
        numbersSquared();
        puppyOwner();
    }
        static void favoriteFruits() {


            Map<String, String> favoriteFruitMap = new HashMap<>();
            favoriteFruitMap.put("Cesar", "Guava");
            favoriteFruitMap.put("Akbar", "Kiwi");
            favoriteFruitMap.put("Joezari", "Mango");
            favoriteFruitMap.put("Grecia", "Bananas");

            for (Map.Entry<String, String> entry : favoriteFruitMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        static void numbersSquared() {

            Map<Integer, Integer> squaredMap = new HashMap<>();
            squaredMap.put(1, 1);
            squaredMap.put(2, 4);
            squaredMap.put(3, 9);
            squaredMap.put(4, 16);
            squaredMap.put(5, 25);

            for (Map.Entry<Integer, Integer> entry : squaredMap.entrySet()) {
                System.out.println(entry.getKey() + "^2 is: " + entry.getValue());
            }
        }
        static void puppyOwner() {
        List<String> puppyList = new ArrayList<>();
        puppyList.add("Leo, the Morkie");
        puppyList.add("Maxine, the mutt");
        puppyList.add("Cheeto, the maltese");
        puppyList.add("Frida, the Cavapoo");

        Map<String,List<String>> puppyMap = new HashMap<>();
        puppyMap.put("Grecia", puppyList);

            for (Map.Entry<String, List<String>> entry : puppyMap.entrySet()) {
                System.out.println(entry.getKey() + " owns the following dogs: \n" + entry.getValue());
            }

        }



        }
