package exception_handling;

import java.util.Scanner;

public class silly {

	public static void main(String[] args) {
		try {
			read();
		} catch(DontBeSillyException e ){
			System.out.println("dontbesilly:)");
		}
		
	}
	public static void read() throws DontBeSillyException{
		System.out.println("input: ");
		Scanner scn = new Scanner (System.in);
		String input = scn.nextLine();
		System.out.println("you wrote: " + input); 
		scn.close();
		if (input.equals("silly")) { //remember to use the .equals() method when comparing strings
			throw new DontBeSillyException();
		}
	}

}
