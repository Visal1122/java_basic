package com.visal.learning;

import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Array;
import java.util.*;

public class HashSetDemo {
    static void main() {
//        HashSet<String> name = new HashSet<>();
//        name.add("Visal");
//        name.add("Visal");
//        name.add("Visal");
//        name.add("Nan");
//        name.add("Jing");
//        name.add("Thya");
////        System.out.println(name);
//
//        List<String> list = new ArrayList<>();
//        list.add("aaa");
//        list.add("bbb");
//        list.add("ccc");
//        list.add("ddd");
////        System.out.println(list);
//
//        name.addAll(list);
//        System.out.println(name);
//
//        Iterator<String> iterator = name.iterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
////            System.out.println(next);
//        }
//
////        name.remove("Jing");
////        System.out.println(name);
        Set<Integer> set1 = new HashSet<>();
        set1.add(22);
        set1.add(13);
        set1.add(41);
        set1.add(50);
        System.out.println(set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(12);
        set2.add(45);
        set2.add(13);
        set2.add(50);
        set2.add(22);
        System.out.println(set2);

        set1.addAll(set2);
        System.out.println(set1);
        set1.retainAll(set2);
        System.out.println(set1);
    }

}
