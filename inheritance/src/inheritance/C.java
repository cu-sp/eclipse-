package inheritance;

public class C extends B{
	public String hello(int num) {
		
		switch(num) {
		case(1):
			return "hello from c!";
		case(2):
			return super.hello();
		default:
			return "hello from c@";
		}
	}

	public C() {
		System.out.println("class C constructor run");
	}
	//SUPER_CLASS name = new CHILD_CLASS();
}
