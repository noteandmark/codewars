package tasks_8_7_level.task5_highestprofitwins;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tasks_8_7_level.task5_highestprofitwins.MinMax;

import java.util.Random;
import static org.junit.Assert.assertArrayEquals;

class MinMaxTest {

    Random rand;

    @BeforeEach
    public void initTest() {
        rand = new Random();
    }

    @Test
    public void testExampleCases() {
        assertArrayEquals(new int[]{1,5}, tasks_8_7_level.task5_highestprofitwins.MinMax.minMax(new int[]{1,2,3,4,5}));
        assertArrayEquals(new int[]{5, 2334454}, tasks_8_7_level.task5_highestprofitwins.MinMax.minMax(new int[]{2334454,5}));
        assertArrayEquals(new int[]{1, 1}, tasks_8_7_level.task5_highestprofitwins.MinMax.minMax(new int[]{1}));
    }

    @Test
    public void minMaxRandomTest() {
        for(int i = 0; i < 20; i++) {
            int r = rand.nextInt();
            assertArrayEquals(new int[]{r, r}, MinMax.minMax(new int[]{r}));
        }
    }
}