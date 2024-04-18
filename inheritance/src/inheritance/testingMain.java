package inheritance;

public class testingMain {

	public static void main(String[] args) {
		C myobj = new C();
		myobj.setMessage("ligma");
		System.out.println(myobj.getMessage());
		//super.getMessage() to get the message from the parent class. Super keyword used in getting the parent stuff.
		System.out.println(myobj.hello(1));
		System.out.println(myobj.hello(2));
		//theSuper keyword can only be used in the object class not in the main method
	}

}
