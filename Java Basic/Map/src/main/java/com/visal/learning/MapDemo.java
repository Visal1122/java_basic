package com.visal.learning;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Double> fruitMap = new HashMap<>();

        fruitMap.put("Apple" , 12.5);
        fruitMap.put("Mango" , 15.5);
        fruitMap.put("Banana" , 11.5);
        System.out.println(fruitMap);
        System.out.println(fruitMap.get("Apple"));
        System.out.println(fruitMap.getOrDefault("Apple1" , 0.0));
        fruitMap.put("Banana1" , 30.0);
        System.out.println(fruitMap);
        fruitMap.remove("Mango");
        System.out.println(fruitMap);
    }
}
