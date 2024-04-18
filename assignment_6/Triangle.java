package edu.nyu.cs.NetID;
import java.lang.Math;

public class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;
	
	Triangle (){
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}
	Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
		if (isValidTriangle(side1,side2,side3)) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
		else {
			throw new IllegalTriangleException(); // need the new keyword here
		}
		
	}
	public double getSide1() {
		return this.side1;
	}
	public double getSide2() {
		return this.side1;
	}
	public double getSide3() {
		return this.side1;
	}
	public double getArea() {
		double p = (side1+side2+side3)/2;
		double area = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		return area;
	}
	public double getPerimeter() {
		return (side1+side2+side3);
	}
	public String toString() {
		String s = "side 1: " + side1 + "\nside 2: " + side2 + "\nside 3: " + side3;
		return s;
	}
	private boolean isValidTriangle (double side1, double side2, double side3) {
		return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
	}
    }
public class IllegalTriangleException (){
	
}

