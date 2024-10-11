package tasks_from_habr_nucleotide.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskBubbleSortTest {

    @Test
    public void testBubbleSort() {
        // Создаем массив с неотсортированными числами
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        int[] expectedArray = {11, 12, 22, 25, 34, 64, 90};

        // Вызываем метод сортировки
        TaskBubbleSort.bubbleSort(array);

        // Проверяем, что массив отсортирован правильно
        assertArrayEquals(expectedArray, array, "Массив должен быть отсортирован по возрастанию");
    }

    @Test
    public void testAlreadySortedArray() {
        // Массив, который уже отсортирован
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7};

        // Вызываем метод сортировки
        TaskBubbleSort.bubbleSort(array);

        // Проверяем, что массив остался отсортированным
        assertArrayEquals(expectedArray, array, "Уже отсортированный массив должен остаться без изменений");
    }

    @Test
    public void testReverseSortedArray() {
        // Массив, отсортированный в обратном порядке
        int[] array = {5, 4, 3, 2, 1};
        int[] expectedArray = {1, 2, 3, 4, 5};

        // Вызываем метод сортировки
        TaskBubbleSort.bubbleSort(array);

        // Проверяем, что массив отсортирован правильно
        assertArrayEquals(expectedArray, array, "Обратный массив должен быть отсортирован по возрастанию");
    }

    @Test
    public void testArrayWithDuplicates() {
        // Массив с дубликатами
        int[] array = {3, 3, 2, 1, 2};
        int[] expectedArray = {1, 2, 2, 3, 3};

        // Вызываем метод сортировки
        TaskBubbleSort.bubbleSort(array);

        // Проверяем, что массив отсортирован правильно
        assertArrayEquals(expectedArray, array, "Массив с дубликатами должен быть отсортирован по возрастанию");
    }

    @Test
    public void testEmptyArray() {
        // Пустой массив
        int[] array = {};
        int[] expectedArray = {};

        // Вызываем метод сортировки
        TaskBubbleSort.bubbleSort(array);

        // Проверяем, что пустой массив остался пустым
        assertArrayEquals(expectedArray, array, "Пустой массив должен оставаться пустым");
    }

}