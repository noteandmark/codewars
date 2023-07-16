package tasks_4_level.task38_nextbiggernumber;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class KataTest {
	@Test
	public void basicTests() {
		assertEquals(21, Kata.nextBiggerNumber(12));
		assertEquals(531, Kata.nextBiggerNumber(513));
		assertEquals(2071, Kata.nextBiggerNumber(2017));
		assertEquals(441, Kata.nextBiggerNumber(414));
		assertEquals(414, Kata.nextBiggerNumber(144));
		assertEquals(19009, Kata.nextBiggerNumber(10990));
	}
}
