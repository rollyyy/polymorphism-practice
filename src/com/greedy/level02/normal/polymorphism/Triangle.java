package com.greedy.level02.normal.polymorphism;

public class Triangle implements IShape{
	
	private double base;	
	private double height;	
	
	public Triangle() {}
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}

	public double hypotenuse() {
		return Math.sqrt(base * base + height);
	}
	
	@Override
	public double area() {
		return (base * height) / 2;
	}

	@Override
	public double perimeter() {
		return base + height + hypotenuse();
	}
}
