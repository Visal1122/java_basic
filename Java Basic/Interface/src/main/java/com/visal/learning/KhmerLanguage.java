package com.visal.learning;

public class KhmerLanguage implements Language{

    @Override
    public void greeting() {
        System.out.println("Sur Sdey");
    }

    @Override
    public void introducing(String name) {
        System.out.println("Nh j'mus " + name);
    }
}
