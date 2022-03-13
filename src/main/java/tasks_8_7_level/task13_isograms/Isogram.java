package tasks_8_7_level.task13_isograms;

import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean  isIsogram(String str) {
        boolean isAdded = true;
        Set<String> words = new HashSet<>();
        for (char symbol: str.toLowerCase().toCharArray()) {
            isAdded=words.add(String.valueOf(symbol));
            if (isAdded == false) break;
        }
        return isAdded;
    }
}
