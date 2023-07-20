package tasks_6_level.task43_ascenddescend;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AscendDescendTest {
    @Test
    public void exampleTests() {
        assertEquals("12321", AscendDescend.ascendDescend(5, 1, 3));
        assertEquals("01210121012101", AscendDescend.ascendDescend(14, 0, 2));
        assertEquals("56789876567", AscendDescend.ascendDescend(11, 5, 9));
        assertEquals("1111111111", AscendDescend.ascendDescend(10, 1, 1));
        assertEquals("-9-8-7-6-5-4-3-4-5-6-7-8-", AscendDescend.ascendDescend(25, -9, -3));
    }
}