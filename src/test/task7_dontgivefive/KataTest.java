package task7_dontgivefive;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @Test
    public void exampleTests() {
        assertEquals(8, Kata.dontGiveMeFive(1,9));
        assertEquals(12, Kata.dontGiveMeFive(4,17));
    }
}