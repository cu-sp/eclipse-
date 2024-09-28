package final_prep;

public class Apple extends Fruit implements Edable{
	public Apple(String color) {
		super(color);
	}
	public void howToEat() {
		System.out.println("Apple: Make apple cider");
	}
}
