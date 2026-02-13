package com.visal.learning;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    void draw(){
        System.out.println("Draw Rectangle");
    }

    @Override
    String getType() {
        return "Rectangle";
    }

    @Override
    double getArea() {
        return width*height;
    }
}
