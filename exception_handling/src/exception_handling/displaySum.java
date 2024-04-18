package exception_handling;
import java.util.Scanner;
import java.util.InputMismatchException;

public class displaySum {

	public static void main(String[] args) {
		sum();
	}
	public static void sum() {
		boolean suc = false;
		while (!suc) {
			Scanner scn = new Scanner (System.in);
			System.out.println("Enter 2 numbers:");
			try{
				suc = true;
				int num1 = scn.nextInt();
				int num2 = scn.nextInt();
				System.out.println("sum is " + (num1 + num2));
				scn.close();
			}
			catch (InputMismatchException e) {
				System.out.println("error");
				
			}
		}
		
	}
	public static void readInt2 () throws InputMismatchException{
		
	}
}
