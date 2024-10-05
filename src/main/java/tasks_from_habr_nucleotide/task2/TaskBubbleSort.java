package tasks_from_habr_nucleotide.task2;

public class TaskBubbleSort {

    public static void bubbleSort(int[] array) {
        int l = array.length - 1;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

}
