package com.visal.learning;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class EnumSetDemo {
    static void main() {

//        Set<Size> sizes = new HashSet<>();
//        sizes.add(Size.SMALL);
//        sizes.add(Size.MEDIUM);
//        sizes.add(Size.LARGE);
//        sizes.add(Size.EXTRA_LARGE);
//        System.out.println(sizes);

        System.out.println(Size.getSizes());

        EnumSet<Size> sizes = EnumSet.allOf(Size.class);
        System.out.println(sizes);
    }

}
