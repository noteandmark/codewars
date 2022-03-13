package tasks_8_7_level.task11_calculatestringrotation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import tasks_8_7_level.task11_calculatestringrotation.CalculateRotation;

class RotationTest {
    @Test
    public void test() {
        assertEquals(-1, tasks_8_7_level.task11_calculatestringrotation.CalculateRotation.shiftedDiff("hoop","pooh"));
        assertEquals(2, tasks_8_7_level.task11_calculatestringrotation.CalculateRotation.shiftedDiff("coffee","eecoff"));
        assertEquals(4, CalculateRotation.shiftedDiff("eecoff","coffee"));
    }
}