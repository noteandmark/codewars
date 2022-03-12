package task11_calculatestringrotation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RotationTest {
    @Test
    public void test() {
        assertEquals(-1, CalculateRotation.shiftedDiff("hoop","pooh"));
        assertEquals(2, CalculateRotation.shiftedDiff("coffee","eecoff"));
        assertEquals(4, CalculateRotation.shiftedDiff("eecoff","coffee"));
    }
}