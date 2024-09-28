package final_prep;

public class Circle extends GeometricObject{
	private double radius; 
	public Circle() {
		super();
	}
	public Circle(double radius) {
		super();
		this.setRadius(radius);
	}
	public Circle(double radius, String color) {
		super();
		this.setRadius(radius);
		this.setColor(color);
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

}
