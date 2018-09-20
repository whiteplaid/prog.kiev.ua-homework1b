package com.homework.triangle;

public class Main {
	public static void main(String[] args) {
	Triangle triangleOne = new Triangle();
	triangleOne.setX(15.0);
	triangleOne.setY(15.0);
	triangleOne.setZ(15.0);
	triangleOne.sum(triangleOne.getX(), triangleOne.getY(), triangleOne.getZ());
	Triangle triangleTwo = new Triangle();
	triangleTwo.setX(12.3);
	triangleTwo.setY(10.0);
	triangleTwo.setZ(5.0);
	triangleTwo.sum(triangleTwo.getX(), triangleTwo.getY(), triangleTwo.getZ());
	}
}
