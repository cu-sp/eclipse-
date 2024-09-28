package final_prep;

abstract class GeometricObject {
	private String color;
	private static int numOfObjects;
	public GeometricObject() {
		numOfObjects++;
	}
	public GeometricObject(String color) {
		setColor(color);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static int getNumOfObjects() {
		return numOfObjects;
	}
}
