package tasks_8_7_level.task9_halvingsum;

import org.junit.jupiter.api.Test;
import tasks_8_7_level.task9_halvingsum.HalvingSum;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HalvingSumTest {
    @Test
    public void test() {
        tasks_8_7_level.task9_halvingsum.HalvingSum hs = new HalvingSum();
        assertEquals(47,hs.halvingSum(25));
        assertEquals(247,hs.halvingSum(127));
    }
}