package assignment_9;
import java.util.Stack;

public class Stacks {
	public static void main(String[] args) {
        System.out.println("1 should be true : " + checkBrackets(""));
        System.out.println("2 should be true: " + checkBrackets("t"));
        System.out.println("3 should be false: " + checkBrackets("((({{"));
        System.out.println("4 should be false: " + checkBrackets("))}}]"));
        System.out.println("5 should be true: " + checkBrackets("({})[]"));
        System.out.println("6 should be false: " + checkBrackets("([)]"));
        System.out.println("7 should be true: " + checkBrackets("abc(def)ghi[jkl]mno"));
        System.out.println("8 should be true: " + checkBrackets("({[]})"));
        System.out.println("9 should be false: " + checkBrackets("){[}"));
        System.out.println("10 should be false: " + checkBrackets("((({{"));
        System.out.println("11 should be false: " + checkBrackets("]]]}"));	
   }

	public static boolean checkBrackets(String input) {
	    Stack<Character> stack = new Stack<>();

	    for (char ch : input.toCharArray()) {
	        switch (ch) {
	            case '(':
	            case '{':
	            case '[':
	                stack.push(ch);
	                break;
	            case ')':
	                if (stack.isEmpty() || stack.pop() != '(')
	                    return false;
	                break;
	            case '}':
	                if (stack.isEmpty() || stack.pop() != '{')
	                    return false;
	                break;
	            case ']':
	                if (stack.isEmpty() || stack.pop() != '[')
	                    return false;
	                break;
	            default:
	                // Ignore other characters
	        }
	    }

	    return stack.isEmpty();
	}
	
}
