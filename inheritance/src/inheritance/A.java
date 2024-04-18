package inheritance;

public class A {
	private String message = "defult";
	public A(){
		System.out.println("class A constructor run");
	}
	public void setMessage(String str) {
		message = str;
	}
	public String getMessage() {
		return message;
	}
	public String hello() {
		return "hello()fromA";
	}
	
}
