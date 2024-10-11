package tasks_from_habr_nucleotide.task4;

import java.util.Arrays;

public class FilterMass {

    public static int[] filterDeleteNumber(int[] array, int deletedNumber) {

        int l = array.length;
        int[] tempArray = new int[l];
        int counter = 0;

        for (int i = 0; i < l - 1; i++) {
            if (array[i] != deletedNumber) {
                tempArray[counter] = array[i];
                counter++;
            }
        }

        int[] resultArray = Arrays.copyOf(tempArray, counter);

        return resultArray;
    }

}
