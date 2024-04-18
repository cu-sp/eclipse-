package feb15;
import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		/*System.out.println("enter a number");
		int num1 = scn.nextInt();
		System.out.println("enter another");
		int num2 = scn.nextInt();
		System.out.println(num1>num2?num1: num2);
		
		
		System.out.println("type a positive int");
		int posint = scn.nextInt();
		if (posint % 2 == 0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}*/
		//System.out.print((posint%2==0)?true:false);
		
		System.out.println("What is the capitol of Canada?\n1. Toronto\n2. Montreal\n3. Ottowa\n4. Vancover");
		int ans = scn.nextInt();
		switch (ans){
			case 1:
			case 2:
				System.out.println("wrong");
				break;
			case 3:
				System.out.println("correct!");
				break;
			case 4:
				System.out.println("wrong");
				break;
		}
	}

}
