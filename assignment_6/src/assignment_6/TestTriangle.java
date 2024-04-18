package assignment_6;
import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter side1: ");
		Double side1 = scn.nextDouble();
		System.out.print("Enter side2: ");
		Double side2 = scn.nextDouble();
		System.out.print("Enter side3: ");
		Double side3 = scn.nextDouble();

		scn.nextLine();
		try {
		Triangle t = new Triangle(side1,side2,side3);
		System.out.print("Enter color: ");
		String color = scn.nextLine();
		System.out.print("filled? (t/f): ");
		boolean filled = scn.nextBoolean();
		System.out.println("");
		t.setcolor(color);
		t.setFilled(filled);
		
		System.out.println(t.toString());
		System.out.println("\nColor: "+t.getColor());
		System.out.println("Is filled: "+t.isFilled());
		System.out.println("Area: "+t.getArea());
		System.out.println("Perimeter: "+t.getPerimeter());
		} catch (IllegalTriangleException e ) {
			System.out.println("Invalid Triangle :(");
		}
		
		scn.close();
	}

}
