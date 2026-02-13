package com.visal.learning;

import java.util.Arrays;

public class PolymorphismDemo {
    public static void main(String[] args) {
//        Shape shape = new Shape();
//        shape.draw();
//        shape = new Circle();
//        shape.draw();
//        shape = new Rectangle();
//        shape.draw();
        Shape[] shapes = new Shape[]{
                new Circle(3),
                new Rectangle(4,2),
                new Triangle(3,4,5)
        };
        Arrays.sort(shapes);
        for(Shape shape : shapes){
            shape.display();
        }
        double totalArea = 0;

        for(Shape shape : shapes){
            totalArea+= shape.getArea();
        }
        System.out.println("Total Area : " + totalArea );
    }



}
