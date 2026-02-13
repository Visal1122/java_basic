package com.visal.learning;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw(){
        System.out.println("Draw Circle ");
    }

    @Override
    String getType() {
       return "Circle";
    }

    @Override
    double getArea() {
        return 3.14*radius*radius;
    }

    public void draw(double radius){
        System.out.println("Draw circle with radius = " + radius);
    }


}
