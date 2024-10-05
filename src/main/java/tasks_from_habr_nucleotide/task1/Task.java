package tasks_from_habr_nucleotide.task1;

import java.util.Arrays;

public class Task {

    public static double[] generateRandomArray(int size) {
        double array[] = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    public static double findMax(double[] array) {
        return Arrays.stream(array).max().orElseThrow();
    }

    public static double findAverage(double[] array) {
        return Arrays.stream(array).average().orElseThrow();
    }

    public static double findMin(double[] array) {
        return Arrays.stream(array).min().orElseThrow();
    }
}
