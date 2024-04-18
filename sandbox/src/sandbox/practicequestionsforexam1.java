package sandbox;
import java.util.Scanner;

public class practicequestionsforexam1 {
	public static void main(String[] args) {
		System.out.println("This \\0is a string");
		System.out.println(strip("test"));
		devis(30);
		System.out.println(palindromeCheck("sadie"));
	}
	
	public static boolean userChoice() {
		Scanner scn = new Scanner (System.in);
		boolean run = true;
		boolean result = false;
		while (run) {
			String input = scn.nextLine();
			if (input.equals("yes")){
				result = true;
				break;
			}
			else if (input.equals("no")) {
				result = false;
				break;
			}
			else {
				
			}
		}
		scn.close();
		return result;
		
	}
	public static boolean userChoiceSwitch() {
		Scanner scn = new Scanner (System.in);
		boolean run = true;
		while(run) {
			String input = scn.nextLine();
			switch (input) {
			case("yes"):
				scn.close();
				return true;
			case("no"):
				scn.close();
				return false;
			default:
			}
		}
		scn.close();
		return true;
	}
	public static void Fibonacci(int number) {
		if (number < 0) {
			System.out.println("invalid input!");
			return;
		}
		int prev1 = 1;
		int prev2 = 0;
		for (int i = 2; i < number + 1; i++) {
			if (i == 2) {
				System.out.println(prev2);
				System.out.println(prev1);
			}
			else {
				int temp;
				System.out.println(prev1+prev2);
				temp = prev1;
				prev1 = prev1+prev2;
				prev2 = temp;
			}
		}
	}
	public static String strip(String input) {
		int index = input.indexOf("\0");
		if (index != -1) {
			return input.substring(0,index);
		}
		else {
			return input;
		}
	}
			//what I learned
				// functions indexOf() and substring()
	
	public static void devis(int k) {
		if (k % 5 == 0 && k % 6 == 0) {
			System.out.println("Both");
		}
		else if (k % 5 == 0 && k % 6 != 0) {
			System.out.println("devis by 5");
		}
		else if (k % 5 != 0 && k % 6 == 0) {
			System.out.println("devis by 6");
		}
		else {
			System.out.println("devis by neither");
		}
	}
	public static String stringReverse(String input) {
		String newString = "";
		for (int i = 0; i < input.length(); i++) {
			char letter = input.charAt(input.length() - (i + 1));
			newString += letter;
		}
		return newString;
	}
	public static boolean palindromeCheck (String string) {
		return (string.equals(stringReverse(string)));
	} 
}
	