package tasks_5_level.task31_scramblies;

import java.util.HashMap;
import java.util.Map;

public class Scramblies {
	public static boolean scramble(String str1, String str2) {
		
		Map<Character, Integer> map1 = getCharacterFrequencyMap(str1);
		
		for (char c : str2.toCharArray()) {
			if (!map1.containsKey(c) || map1.get(c) <= 0) {
				return false;// Character not found or frequency is negative
            }
			map1.put(c, map1.get(c) - 1);
		}
		
		return true; // All characters from str2 are included in str1
		
	}
	
    private static Map<Character, Integer> getCharacterFrequencyMap(String str) {
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : str.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
        return charFrequency;
    }
}
