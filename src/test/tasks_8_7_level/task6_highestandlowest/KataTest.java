package tasks_8_7_level.task6_highestandlowest;

import org.junit.jupiter.api.Test;
import tasks_8_7_level.task6_highestandlowest.Kata;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.*;

class KataTest {
    @Test
    public void test1() {
        assertEquals("42 -9", tasks_8_7_level.task6_highestandlowest.Kata.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
    @Test
    public void test2() {
        assertEquals("3 1", Kata.highAndLow("1 2 3"));
    }
}