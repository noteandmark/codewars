package tasks_8_7_level.task36_allstarnumber22;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class TimeConverterTest {
	  
    @Test
    public void fixedTests() {
        assertEquals("1 hour(s) and 0 minute(s)", TimeConverter.toTime(3600));
        assertEquals("1 hour(s) and 0 minute(s)", TimeConverter.toTime(3601));  
        assertEquals("0 hour(s) and 58 minute(s)", TimeConverter.toTime(3500));
        assertEquals("89 hour(s) and 51 minute(s)", TimeConverter.toTime(323500));
        assertEquals("0 hour(s) and 0 minute(s)", TimeConverter.toTime(0));
    }
}
