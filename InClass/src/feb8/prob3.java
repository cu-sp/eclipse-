package feb8;

import java.util.Scanner;

public class prob3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter one number");
		String num1 = scn.nextLine();
		System.out.println("enter another number");
		String num2 = scn.nextLine();
		
		int i = Integer.parseInt(num1);
		int j = Integer.parseInt(num2);
		
		System.out.println("addition: " + (i + j));
		System.out.println("subtraction: " + (i-j));
		System.out.println("multiplication: " + (i*j));
		System.out.println("devision: " + (i/j));
		
	}

}
