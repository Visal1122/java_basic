package com.visal.learning;

import java.lang.reflect.RecordComponent;

public class AnonymousClassDemo {
    Shape sh1 = new Shape()
    {
        public void draw(){
            System.out.println("Draw from anonymous class");
        }
    };
    Polygon poly = new Polygon() {
        @Override
        public void info() {
            System.out.println("Polygon info from anonymous class");
        }
    };


    public static void main(String[] args) {
        Ractangle ractangle = new Ractangle();
        ractangle.draw();
        AnonymousClassDemo demo = new AnonymousClassDemo();
        demo.sh1.draw();
        demo.poly.info();
    }
}
