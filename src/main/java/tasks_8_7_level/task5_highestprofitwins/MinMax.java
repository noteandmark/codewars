package tasks_8_7_level.task5_highestprofitwins;

import java.util.Arrays;

public class MinMax {
    public static int[] minMax(int[] arr) {
        int[] result = new int [2];
        Arrays.sort(arr);
        result[0] = arr[0];
        result[1] = arr[arr.length-1];
        return result;
    }
}
