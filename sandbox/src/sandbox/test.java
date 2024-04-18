package sandbox;
import java.util.Scanner;
import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		String test = "1";
		String test2 = "2";
		String int1;
		int[] arr1 = {1,2,3,4,5};
		String[] arr1String = {"apple","bannana","pinapple","urmom"};
		int[] arr2 = {1,2,3,4,5};
		int[][][]$2d = {{{2}},{{1}}};
		checkerBoard(3,5);
		System.out.println("");
		all3(arr1,arr2);
		System.out.println(test.equals(test2));
		System.out.println(Arrays.deepToString($2d));
		System.out.println(userInputArray());
		JoinSplit(arr1String);
	}
	public static void checkerBoard(int row, int col) {
		boolean isX = true;
		for (int i = 0; i < row; i++) {
			System.out.println("");
			for(int j = 0; j < col; j++) {
				if (isX == true) {
					System.out.print("X");
					isX = false;
				}
				else {
					System.out.print("O");
					isX = true;
				}
			}
		}
	}
	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		int[] newArr = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			newArr[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			newArr[i+arr1.length] = arr2[i];
		}
		return newArr;
	}
	
	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			//System.out.println(Arrays.toString(arr));
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void all3(int[] arr1, int[] arr2) {
		int[] arr3 = bubbleSort(mergeArrays(arr1,arr2));
		printArray(arr3);
	}
	public static String userInputArray() {
		Scanner scn = new Scanner (System.in);
		String[] numbers = new String[0];
		
		boolean run = true;
		while (run) {
			System.out.println("enter something for your array");
			String string = scn.nextLine();
			if (string.equals("quit")) {
				scn.close();
				run = false;
			}
			else {
				String[] newWords = Arrays.copyOf(numbers, numbers.length + 1);
				newWords[numbers.length] = string;
				numbers = newWords;
				System.out.println(Arrays.toString(numbers));
			}
		}
		return Arrays.toString(numbers);
	}
	public static void JoinSplit(String[] arr) {
		String joinedString = String.join(",", arr);
		System.out.println(joinedString);
		String[] newArray = joinedString.split(",");
		arr = null;
		System.out.println(Arrays.toString(newArray));
		System.out.println(arr);
	}
}
