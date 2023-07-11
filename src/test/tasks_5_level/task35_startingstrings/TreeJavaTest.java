package tasks_5_level.task35_startingstrings;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class TreeJavaTest {

	@Test
	void test() {
      assertTrue(Arrays.equals(new String[]{"abc", "abcd", "abcde", "hello", "hey"}, TreeJava.solution("a abc abcd abcde hey hello")));
      assertTrue(Arrays.equals(new String[]{}, TreeJava.solution("a abc abcd abe hi hello")));
      assertTrue(Arrays.equals(new String[]{"abc", "abcd", "abcde"}, TreeJava.solution("Abc aBcd AbcDe")));
      assertTrue(Arrays.equals(new String[]{"all", "is", "solution", "this"}, TreeJava.solution("this is all solution")));
      assertTrue(Arrays.equals(new String[]{"only", "solutions", "some"}, TreeJava.solution("only some solutions are answers")));
      assertTrue(Arrays.equals(new String[]{}, TreeJava.solution("nothing is solution neither in string")));
  }
}
