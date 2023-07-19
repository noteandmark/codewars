package tasks_8_7_level.task41_validparentheses;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidParenthesesTest {
	  @Test @DisplayName("Should return true for valid parentheses")
	  void validCases() {
	    runTest(true, "()");
	    runTest(true, "((()))");
	    runTest(true, "()()()");
	    runTest(true, "(()())()");
	    runTest(true, "()(())((()))(())()");
	  }
	  
	  @Test @DisplayName("Should return false for invalid parentheses")
	  void invalidCases() {
	    runTest(false, ")(");
	    runTest(false, "()()(");
	    runTest(false, "((())");
	    runTest(false, "())(()");
	    runTest(false, ")()");
	    runTest(false, ")");
	  }
	  
	  @Test @DisplayName("Should return true for empty strings")
	  void emptyString() {
	    runTest(true, "");
	  }
	  private void runTest(boolean expected, String input) {
	    assertEquals(expected, ValidParentheses.validParentheses(input), "Test failed for input \""+input+"\"");
	  }
}
