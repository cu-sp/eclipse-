package files_for_assignment3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Q2: Prime numbers (10 pts)
 * 
 * Write a Java program that prints out all prime numbers between 
 * two integer inputs `a` and `b` (without the quotes), inclusive.
 * 
 * 
 * Notes:
 *    This problem asks you to write a complex program.
 * 
 *    Don't panic! 
 * 
 *    The key to solving complex programming problem is to break the problem
 *    into subproblems that are easier to manage. Solve the easier subproblems, 
 *    combine them to solve the original, complex problem.
 * 
 *    I suggest breaking down this problem into two components:
 *      i)    Prompting the user for input and checking if the input is correct (see instructions).
 *      ii)   Checking whether a given positive integer is prime.
 * 
 *      After this, you can expand the program to test whether other numbers are prime
 *      using a loop.
 * 
 * Instructions:
 * 1) The inputs a and b (defined in the main method for your convenience) should be provided by the user.
 *    You may use any methods from the Scanner class to help you do so. 
 * 
 *    The inputs a and b should be i) integers, ii) strictly positive (>= 1) and iii) the input b should be greater or equal than a. 
 *      - You may assume the input will always be entered as integers. You do NOT need to check this.
 *      - However, you MUST check whether the inputs are strictly positive and whether b >= a.
 *        If the inputs are incorrect, your program should print "Incorrect input!" and stop. 
 * 
 * 
 * 2) An integer greater than 1 is prime if its only positive divisor is 1 or itself.
 *    For example, the numbers 2,3,5,7 are all prime numbers, but 4,6,8, and 9 are not.
 *    To determine whether a number is prime, check whether it is divisible by every number between 2 and number/2.
 * 
 * 
 * 3) Your code should print out all prime numbers between the integer inputs a and b, inclusive.
 *    The formatting of the output is not important; you'll get full marks as long as the input is checked
 *    for correctness and all the correct prime numbers are printed.
 */


public class PrimeNumbers{
  public static void main(String[] args) throws Exception {
	  Scanner scn = new Scanner (System.in);
	  
	  
	  System.out.print("Enter two numbers, a and b. \na:");		//prompts user
	  int a = scn.nextInt();
	  
	  System.out.print("b:");
	  int b = scn.nextInt();
	  scn.close();
	  
	  List<Integer> primeNumbers = new ArrayList<>();
	  primeNumbers = primeScope(a,b);
	  System.out.println(formatPrime(primeNumbers, a, b));	
	  
  }
  
  //	This method finds the all the prime numbers between 2 numbers and returns them in List<Integer> format	//
  public static List<Integer> primeScope(int a, int b) {
	  
	  List<Integer> primeNumbers = new ArrayList<>();
	  
	  for (int i = a; i <= b; i++) { 
		  if(prime(i) == true) {		//makes first number not have a comma before it 
			  primeNumbers.add(i);
		  }
		  else if (prime(i) == true) {
			  primeNumbers.add(i);
		  }
	  }
	  return primeNumbers;
  }
  
  //	This method turns the List<Integer> of prime numbers into the user output	//
  public static StringBuilder formatPrime(List<Integer> prime, int a, int b) {
	  StringBuilder finalOut = new StringBuilder("Prime numbers between " + a + " and " + b + " are: ");
	  for (int i = 0; i < prime.size(); i++) {
		  finalOut.append(prime.get(i));
		   if (i == prime.size() - 2){
			  finalOut.append(", and ");
		  }
		   else if (i != prime.size() - 1) {
			  finalOut.append(", ");
		  }
	  }
	  return finalOut;
  }
  //	This method checks if an inputed integer is a prime number or not	//
  public static boolean prime(int number) {
	  boolean isPrime = true;
	  
	  //checking for strange cases
	  if (number == 0) {
		  return false;
	  }
	  else if (number == 1) {
		  return false;
	  }
	  else if (number == 2) {
		  return true;
	  }
	  
	  //main for loop, does not include i = 1 due to the fact that all numbers can be devided by 1
	  for(int i = 2; i < number; i++) {
		  if (number % i == 0) {
			  return false;		//returns false breaking the loop if the number is devisable by i as that would make it not prime
		  }
		  else {
			  isPrime = true;	//continues the loop
		  }
		  
	  }
	  return isPrime;	//this would only run if the number is prime
  }
}
