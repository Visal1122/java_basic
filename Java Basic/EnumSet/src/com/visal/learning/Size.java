package com.visal.learning;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public enum Size {
    SMALL, MEDIUM, LARGE , EXTRA_LARGE , EX;
    public static Set<Size> getSizes() {
//        Set<Size> sizes = new HashSet<>();
//        sizes.add(Size.SMALL);
//        sizes.add(Size.MEDIUM);
//        sizes.add(Size.LARGE);
//        sizes.add(Size.EXTRA_LARGE);
//        return sizes;
        return EnumSet.allOf(Size.class);

    }

}
