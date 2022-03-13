package tasks_8_7_level.task7_dontgivefive;

import org.junit.jupiter.api.Test;
import tasks_8_7_level.task7_dontgivefive.Kata;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @Test
    public void exampleTests() {
        assertEquals(8, tasks_8_7_level.task7_dontgivefive.Kata.dontGiveMeFive(1,9));
        assertEquals(12, Kata.dontGiveMeFive(4,17));
    }
}