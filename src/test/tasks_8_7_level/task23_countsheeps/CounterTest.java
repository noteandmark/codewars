package tasks_8_7_level.task23_countsheeps;

import static org.junit.Assert.*;

import org.junit.Test;

import tasks_8_7_level.task23_countsheeps.Counter;

public class CounterTest {
    Boolean[] array1 = {true,  true,  true,  false,
                      true,  true,  true,  true ,
                      true,  false, true,  false,
                      true,  false, false, true ,
                      true,  true,  true,  true ,
                      false, false, true,  true };

    @Test
    public void test() {
      assertEquals("There are 17 sheeps in total", 17, new Counter().countSheeps(array1));
    }

}
