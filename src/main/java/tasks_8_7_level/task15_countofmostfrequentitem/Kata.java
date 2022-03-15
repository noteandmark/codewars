package tasks_8_7_level.task15_countofmostfrequentitem;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static int mostFrequentItemCount(int[] collection) {
        if (collection.length == 0) return 0;
        Map<Integer,Integer> hashMap = new HashMap<>();
        for (int number : collection) {
            Integer frequency = hashMap.get(number);
            hashMap.put(number, frequency == null ? 1 : frequency + 1);
        }
        return Collections.max(hashMap.values());
    }
}
