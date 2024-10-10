package com.pluralsight.week3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListExercises {
    public static void main(String[] args) {

        String favoriteSong1 = "Head Over Heels";
        String favoriteSong2 = "Yellow";
        String favoriteSong3 = "Sparks";

        String[] favoriteSongs = {"Head Over Heels", "Yellow", "Sparks"};

        ArrayList<String> favoriteSongList = new ArrayList<>();
        favoriteSongList.add("Head Over Heels");
        favoriteSongList.add("Yellow");
        favoriteSongList.add("Sparks");

        System.out.println("These are my favorite " + favoriteSongList.size() + " songs!");

        favoriteSongList.remove("Head Over Heels");

        Collections.sort(favoriteSongList);

        System.out.println(favoriteSongList.get(0));
        favoriteSongList.remove(0);
        System.out.println(favoriteSongList.get(0));

        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(21);
        ages.add(29);
        ages.add(29);
        ages.add(30);

        ArrayList<Integer> agesDoubled = new ArrayList<>();
        for (int age : ages) {
            agesDoubled.add(age * 2);
        }
        Collections.sort(agesDoubled);

        int sum = 0;
        for (int age : agesDoubled) {
            sum += age;
        }

        double average = sum / (double) agesDoubled.size();
        System.out.println("Our ages times 2 is: " + agesDoubled);
        System.out.println("Sum of all ages is: " + sum);
        System.out.println("Average age is: " + average);

    }
}


