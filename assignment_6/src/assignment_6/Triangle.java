package assignment_6;
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
		if(!IllegalTriangle(side1,side2,side3)) {
			throw new IllegalTriangleException(); // have to use the new keyword
		}
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
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
		double area = Math.sqrt(p * (p-this.side1) * (p-this.side2) * (p-this.side3));
		return area;
	}
	public double getPerimeter() {
		return (side1+side2+side3);
	}
	public String toString() {
		String s = "Your Triangle\nSide 1: " + side1 + "\nSide 2: " + side2 + "\nSide 3: " + side3;
		return s;
	}
	private boolean IllegalTriangle(double side1, double side2, double side3) {
		return side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2;
	}
}