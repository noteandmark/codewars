package tasks_8_7_level.task2_countingduplicates;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        int result = 0;
        LinkedHashMap<Character, Integer> mapOfUniqueCharacters = new LinkedHashMap<Character, Integer>();

        for (Character character : text.toCharArray()) {
            char symbol = Character.toLowerCase(character);
            mapOfUniqueCharacters.put(
                    symbol,
                    (mapOfUniqueCharacters.get(symbol) == null) ? 1 : mapOfUniqueCharacters.get(symbol) + 1);
        }

        for (Map.Entry entry: mapOfUniqueCharacters.entrySet()) {
            int value = (int) entry.getValue();
            if (value>1) {
                result++;
            }
        }

        return result;
    }
}
