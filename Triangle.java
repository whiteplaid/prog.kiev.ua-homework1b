package com.homework.triangle;

public class Triangle {
	private double x;
	private double y;
	private double z;
	
	public Triangle(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;

	}
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double area () {
		double halfPerimeter = (x + y + z)/2;
		double area = Math.sqrt(halfPerimeter*(halfPerimeter - x)*(halfPerimeter - y)*(halfPerimeter - z));
		return area;
	}
	public void print() {
		System.out.println(area());
	}
	
}
