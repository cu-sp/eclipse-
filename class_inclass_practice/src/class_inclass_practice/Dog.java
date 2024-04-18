package class_inclass_practice;

public class Dog {
    // non-static properties
    private String name;
    private int age;
    private String breed;
    private int weight;
    
    // static property
    private static int numDogs = 0;
    
    // Constructors
    public Dog() { //you can add multiple constructors, allowing you to define objects with no properties
    	
    }
    
    public Dog(String name, int age, String breed, int weight) { //remember commas not semi colons
    	this.name = name;
    	this.age = age;
    	this.breed = breed;
    	this.weight = weight;
    }
    
    // methods
    public void bark() {
    	if((this.age >= 0) && (this.age <= 10)) {
    		System.out.printf("%s says, 'Woof!' ", this.name );
    	}
    }
    
    // setter method. This method sets the age of the dog after initialization.
    // it is simaler to the constructor but is void and name is different
    public void setAge(int age) {
    	if (age == 0 && age < 20) {
    		this.age = age;
    	}
    	
    }
    // getter method. Retreves the inner value and returns it 
    public int getAge() {
    	return this.age;
    	
    }
    // define comparison methods here
    
    // define toString() method here
}
