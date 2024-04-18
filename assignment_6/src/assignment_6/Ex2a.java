package assignment_6;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Ex2a {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*100); 
		}
		System.out.println(Arrays.toString(arr));
		try {
			System.out.println("Enter index");
			int index = scn.nextInt();
			System.out.println(arr[index]);
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Out Of Bounds!");
		}
	}
}
