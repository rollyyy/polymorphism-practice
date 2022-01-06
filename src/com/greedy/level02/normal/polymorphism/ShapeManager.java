package com.greedy.level02.normal.polymorphism;

public class ShapeManager {

public void calcShape() {
		
		IShape[] shapeList = { new Rectangle(34.5, 42.7), new Circle(15.5)};
		
		for(IShape shape : shapeList) {
			
			String shapeType = shape instanceof Rectangle ? "Rectangle" : "Circle";
			
			System.out.println(shapeType + " : " + shape.area());
			System.out.println(shapeType + " : " + shape.perimeter());
		}
	}
	
	
	public void calcShapeArray() {
		
		IShape[] iarr = new IShape[5];
		
		iarr[0] = new Circle(3.1);
		iarr[1] = new Rectangle(2.3, 4.1);
		iarr[2] = new Triangle(4.0, 2.5);
		iarr[3] = new Circle(1.5);
		iarr[4] = new Triangle(2.0, 3.0);
		
		for(int i = 0; i < iarr.length; i++) {
			
			String shapeType = "";
			
			if(iarr[i] instanceof Circle) {
				shapeType = "Circle";
			} else if(iarr[i] instanceof Rectangle) {
				shapeType = "Rectangle";
			} else if(iarr[i] instanceof Triangle) {
				shapeType = "Triangle";
			}
			
			System.out.print(shapeType + " - 면적 : " + iarr[i].area() + ", 둘레 : " + iarr[i].perimeter());
			
			if(iarr[i] instanceof Triangle) {
				System.out.println(", 빗변 : " + ((Triangle)iarr[i]).hypotenuse());
			} else {
				System.out.println();
			}
			
		}
		
	}
}
