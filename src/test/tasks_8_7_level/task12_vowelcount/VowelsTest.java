package tasks_8_7_level.task12_vowelcount;

import org.junit.Test;
import tasks_8_7_level.task12_vowelcount.Vowels;

import static org.junit.Assert.*;

public class VowelsTest {
    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
    }
}