package com.visal.learning;

import javax.sound.midi.Soundbank;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
    static void main() {
        TreeMap<String , Integer> fruitMap = new TreeMap<>();
        fruitMap.put("apple",12);
        fruitMap.put("orange",15);
        fruitMap.put("banana",17);
        fruitMap.put("mango",14);

        System.out.println(fruitMap);

//        System.out.println(fruitMap.firstKey());
//        System.out.println(fruitMap.lastKey());
//
//        System.out.println(fruitMap.firstEntry());
//        System.out.println(fruitMap.lastEntry());
//
//        System.out.println(fruitMap.higherKey("banana"));
//        System.out.println(fruitMap.lowerKey("banana"));
//
//        System.out.println(fruitMap.ceilingKey("banana"));
//        System.out.println(fruitMap.floorKey("banana"));

        System.out.println(fruitMap.get("mango"));
        System.out.println(fruitMap);

        System.out.println(fruitMap.pollFirstEntry());
        System.out.println(fruitMap);

        SortedMap<String, Integer> headMap = fruitMap.headMap("banana");
        System.out.println(headMap);
    }
}
