package assignment_4;
import java.util.Arrays;
import java.util.Scanner;

public class A4_DYD2008 {

	public static void main(String[] args) {
		// PROBLEM 1//
		Scanner scn = new Scanner (System.in);
		
		System.out.print("-----Problem 1-----\n(Avr of an array)\n");
		int[] array = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("enter number " + (i+1) + " of array: ");
			int value = scn.nextInt();
			array[i] = value;
		}
		
		System.out.println(average(array)); 
		
		System.out.println("<press return>");
		scn.nextLine();
		scn.nextLine();
		
		System.out.println("------Problem 2-----");
		//Check if an array is 1 dimentional
		//test cases below
		int[] problem2Wrong = {1,2,3,4,3}; //should return false
		int[] problem2Correct1 = {1,2,3,4,5,6,7,8,9}; //should return true
		int[] problem2Correct2 = {6,2,5,4,9,1,7,8,3}; //should return true
				
		System.out.println("Should return false: " + check1DArray(problem2Wrong)); //returns false
		System.out.println("Should return true: " + check1DArray(problem2Correct1)); 
		System.out.println("Should return true: "+ check1DArray(problem2Correct2));
		
		System.out.println("<press return>");
		scn.nextLine();
		
		System.out.println("------Problem 3-----");
		System.out.println("Enter a number to count occurrences for (for the array you entered for problem 1): ");
		int occurrencesNumber = scn.nextInt();
		System.out.println("The number "+occurrencesNumber+ " apears in the array you entered "+countOccurrences(array, occurrencesNumber)+" times.");
		
		System.out.println("<press return>");
		scn.nextLine();
		scn.nextLine();
		
		System.out.println("------Problem 4-----");
		System.out.println("The number that apears the most in the array you entered is "+occursMostOften(array));
		
		System.out.println("<press return>");
		scn.nextLine();
		
		System.out.println("------Problem 5-----\n(Palendrome)");
		System.out.println("Enter a word: ");
		String palindrome = scn.nextLine();
		if (palindromeCheck(palindrome))
			System.out.println("The word " + palindrome + " is a palendrome.");
		else 
			System.out.println("The word " + palindrome + " is not a palendrome.");
		
		System.out.println("<press return>");
		scn.nextLine();
		
		System.out.println("------Problem 6-----\n(isSorted or not)\n");
		System.out.println("How long do you want your new array?");
		int length = scn.nextInt();
		int[] array2 = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.print("enter number " + (i+1) + ": ");
			int value = scn.nextInt();
			array2[i] = value;
		}
		if (isSorted(array2)) {
			System.out.println("The array you entered is sorted");
		}
		else {
			System.out.println("The array you entered is not sorted");
		}
		
		System.out.println("<press return>");
		scn.nextLine();
		scn.nextLine();
		
		System.out.println("------Problem 7-----");
		System.out.println("Merging the first array you typed in and the second, and sorting the merged array:");
		System.out.println(Arrays.toString(mergeArrays(array,array2)));
		
		scn.close();
	}
	
	//problem 1
	public static Double average(int[] array) {
		Double sum = 0.0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		Double average = sum / array.length;
		return average;
	}
	
	public static Double average(Double[] array) {
		Double sum = 0.0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		Double average = sum / array.length;
		return average;
	}
	
	//checks if an array only has has the numbers 1-9 in it. The order does not matter.
	//problem 2
	public static Boolean check1DArray(int[] array) {
		boolean result = false;
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
			if (array[i] == 1 || array[i] == 2 || array[i] == 3 || array[i] == 4 || 
					array[i] == 5 || array[i] == 6 || array[i] == 7 || array[i] == 8 || array[i] == 9 ) {
				result = true;
			}
			else {
				result = false;
			}
		}
		if (sum != 45) {
			result = false;
		}
		return result;
	}
	//problem 3
	public static int countOccurrences(int[] arr, int x) {
		int count = 0;
		for (int i: arr) {
			if (i == x) {
				count++;
			}
		}
		return count;
	}
	//problem 4
	public static int occursMostOften(int[] arr) {
		int number = 0;
		int largestCount = 0;
		for (int i: arr) {
			if (countOccurrences(arr, i) > largestCount) {
				largestCount = countOccurrences(arr, i);
				number = i;
			}
		}
		return number;
	}
	
	//problem 5
	public static boolean palindromeCheck (String string) {
		String newString = "";
		for (int i = 0; i < string.length(); i++) {
			char letter = string.charAt(string.length() - (i + 1));
			newString += letter;
		}
		return (string.equals(newString));
	}
	public static boolean isSorted(int[] arr) {
		int[] newArr = new int[arr.length];
		//copies arr into newArr
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		Arrays.sort(newArr);
		if (Arrays.equals(arr,newArr)) {
			return true;
		}
		else {
			return false;
		}
			
	}
	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		int[] newArr = new int[arr1.length+arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			newArr[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			newArr[i+arr1.length] = arr2[i];
		}	
		//bubble sort alg
		bubbleSort(newArr);
		return newArr;
	}
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length -1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}