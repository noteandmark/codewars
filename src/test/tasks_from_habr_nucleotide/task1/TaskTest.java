package tasks_from_habr_nucleotide.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    @Test
    public void testTask() {

        // Генерируем массив случайных чисел
        double[] array = Task.generateRandomArray(100);

        // Проверяем, что массив имеет правильную длину
        assertEquals(100, array.length, "Длина массива должна быть 100");

        // Находим максимальное и минимальное значение вручную
        double expectedMax = array[0];
        double expectedMin = array[0];
        double sum = 0;

        for (double num : array) {
            if (num > expectedMax) {
                expectedMax = num;
            }
            if (num < expectedMin) {
                expectedMin = num;
            }
            sum += num;
        }

        // Проверяем, что найденное методом значение совпадает с ручным поиском
        double max = Task.findMax(array);
        double min = Task.findMin(array);
        double average = Task.findAverage(array);

        assertEquals(expectedMax, max, "Максимальное значение не совпадает");
        assertEquals(expectedMin, min, "Минимальное значение не совпадает");
        assertEquals(sum / array.length, average, 0.0001, "Среднее значение не совпадает");

        // Дополнительно проверим, что max >= min
        assertTrue(max >= min, "Максимальное значение должно быть больше или равно минимальному");
    }

}