package com.greedy.level02.normal.polymorphism;

public class Circle implements IShape{
	
	public static final double PI = Math.PI;
	private double radius;
	
	public Circle() {}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public double area() {
		return radius * radius * PI;
	}

	@Override
	public double perimeter() {
		return radius * 2 * PI;
	}
}
