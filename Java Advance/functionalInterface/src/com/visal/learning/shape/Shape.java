package com.visal.learning.shape;

@FunctionalInterface
public interface Shape {
	double getArea();
	
	default void newFeature() {
		System.out.println("This is a new feature");
	}
	
}
