package tasks_8_7_level.task41_validparentheses;

import java.util.Stack;

public class ValidParentheses {
	public static boolean validParentheses(String parenStr) {
		
	    while (parenStr.contains("()")){
	        parenStr = parenStr.replace("()", "");
	        }
	        return parenStr.isEmpty();
		
		
			/*
			 * Stack<Character> stack = new Stack<>();
			 * 
			 * for (char c : parenStr.toCharArray()) { if (c == '(') { stack.push(c); } else
			 * if (c == ')') { if (stack.isEmpty()) { return false; } stack.pop(); } }
			 * 
			 * return stack.isEmpty();
			 */
	}
}
