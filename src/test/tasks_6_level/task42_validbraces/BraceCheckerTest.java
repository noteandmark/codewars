package tasks_6_level.task42_validbraces;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BraceCheckerTest {

	private BraceChecker checker = new BraceChecker();

	@Test
	public void testValid() {
		assertEquals(true, checker.isValid("()"));
	}

	@Test
	public void testInvalid() {
		assertEquals(false, checker.isValid("[(])"));
	}
}