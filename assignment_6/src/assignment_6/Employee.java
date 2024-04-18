package assignment_6;

public class Employee {
	private String name;
	private double payRate = 1.0;
	private int employee_ID = 0;
	public final double STARTING_PAY_RATE = 30000.0;
	
	Employee(String name){
		this.name = name;
	}
	Employee(String name, double payRate){
		this.name = name;
		this.payRate = payRate;
	}
	public String getName (){
		return this.name;
	}
	public int getEmployeeID (){
		return this.employee_ID;
	}
	public double getPayRate() {
		return this.payRate;
	}
	public double getEffectiveSalary() {
		return payRate * 40 * 52;//40 hours a week, 52 weeks per year.
	}
	public void changeName(String name) {
		this.name = name;
	}
	public void changePayRate(double rate) {
		this.payRate = rate;
	}
	public String toString() {
		return "Employee [name=" + name + ", payRate=" + payRate + ", employeeID=" + employee_ID + "]";
	}
}
