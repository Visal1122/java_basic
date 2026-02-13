package com.visal.learning;

public abstract class Shape implements Comparable<Shape>{
    void draw(){
        System.out.println("Draw shape");
    }
    abstract String getType();
    abstract double getArea();
    void display(){
        System.out.println("Shape Type : " + getType() + "\n" + "Area : " + getArea());
    }
    public int compareTo(Shape other){
        return (int) (this.getArea()-other.getArea());
    }

}
