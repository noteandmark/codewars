package tasks_8_7_level.task1_stringsendswith.test.task1_stringsendswith;

import tasks_8_7_level.task1_stringsendswith.Kata;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class KataTest {

    @Test
    void solution() {
        assertTrue(Kata.solution("abc", "bc"));
        assertFalse(Kata.solution("abc", "d"));
        assertFalse(Kata.solution("samurai", "ra"));
    }
}