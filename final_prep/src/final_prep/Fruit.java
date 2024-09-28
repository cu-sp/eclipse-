package final_prep;

public abstract class Fruit {
	private String color;
	public Fruit() {
		
	}
	public Fruit(String color) {
		setColor(color);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
}
