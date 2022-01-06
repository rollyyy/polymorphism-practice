package com.greedy.level01.basic.polymorphism;

public class ShapeManager {
	
	
	public void calcShape() {
		Shape[] shapeList = { new Rectangle(34.5, 42.7), new Circle(15.5)};
		
		for(Shape shape : shapeList) {
			
			String shapeType = shape instanceof Rectangle ? "Rectangle" : "Circle";
			
			System.out.println(shapeType + " : " + shape.area());
			System.out.println(shapeType + " : " + shape.perimeter());
		}
		
	}
}
