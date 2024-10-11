package tasks_from_habr_nucleotide.task3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumbersTest {

    @Test
    public void testPrimeNumbersInRange() {
        // Ожидаемый результат: простые числа от 2 до 100
        int[] expectedPrimes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        // Список для сохранения найденных простых чисел
        int[] actualPrimes = new int[25];
        int index = 0;

        // Проходим по всем числам от 2 до 100 и сохраняем простые числа в массив
        for (int i = 2; i <= 100; i++) {
            if (PrimeNumbers.isPrime(i)) {
                actualPrimes[index++] = i;
            }
        }

        // Проверяем, что массив простых чисел совпадает с ожидаемым
        assertArrayEquals(expectedPrimes, actualPrimes, "Простые числа в диапазоне от 2 до 100 должны совпадать");
    }
}