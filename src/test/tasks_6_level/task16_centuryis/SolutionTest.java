package tasks_6_level.task16_centuryis;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals("20th", Solution.whatCentury(1999));
        assertEquals("20th", Solution.whatCentury(2000));
        assertEquals("21st", Solution.whatCentury(2011));
        assertEquals("22nd", Solution.whatCentury(2154));
        assertEquals("23rd", Solution.whatCentury(2259));
        assertEquals("81st", Solution.whatCentury(8012));
    }
}