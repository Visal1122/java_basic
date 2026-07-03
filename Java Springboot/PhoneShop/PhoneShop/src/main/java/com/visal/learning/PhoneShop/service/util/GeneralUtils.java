package com.visal.learning.PhoneShop.service.util;

import java.util.List;

public class GeneralUtils {
    public static List<Integer> toIntegerList(List<String> list) {
        return list.
                stream()
                .map(String::length)
                .toList();
    }
    public static List<Integer> getEvenNumber(List<Integer> list){
        return list.
                stream().
                filter(x -> x%2 == 0).
                toList();
    }

}
