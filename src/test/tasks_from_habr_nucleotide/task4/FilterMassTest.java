package tasks_from_habr_nucleotide.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FilterMassTest {

    @Test
    public void testMassiveRightDeletingNumber() {

        int[] actualArray = {1, 2, 3, 2, 4, 5, 2, 6, 7, 8, 9, 0, 2};

        int[] expectedArray = {1, 3, 4, 5, 6, 7, 8, 9, 0};

        actualArray = FilterMass.filterDeleteNumber(actualArray, 2);

        assertArrayEquals(expectedArray, actualArray, "Массивы должны совпадать");
    }

}