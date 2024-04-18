package class_inclass_practice;

public class CodingWithDogs {

	public static void main(String[] args) {
		
		Dog myDog = new Dog("Pixie",5,"Mutt",60);
		Dog myDog2 = new Dog("Cupcake",3,"Pitbull",120);
		myDog.bark();
		myDog2.bark();
		myDog2.setAge(5);
		System.out.println(myDog2.getAge());
		
	}

}
