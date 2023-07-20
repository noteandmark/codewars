package tasks_6_level.task43_ascenddescend;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AscendDescendTest {
    @Test
    public void exampleTests() {
        assertEquals("12321", AscendDescend.ascendDescend(5, 1, 3));
        assertEquals("01210121012101", AscendDescend.ascendDescend(14, 0, 2));
        assertEquals("56789876567", AscendDescend.ascendDescend(11, 5, 9));
    }
}