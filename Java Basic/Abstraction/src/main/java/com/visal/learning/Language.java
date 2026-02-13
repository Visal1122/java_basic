package com.visal.learning;

public abstract class Language {
    protected int year;
    public Language(){
        this(1260);
    }
    public Language(int year){
        this.year = year;
    }

    abstract void display();
    void info(){
        System.out.println("This Language was invented in " + year);
    }
}
