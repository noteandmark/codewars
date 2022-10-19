package tasks_6_level.task25_findodd;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindOdd {

	public static int findIt(int[] a) {

		int key = 0;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {

			key = a[i];
			Integer value = map.get(key);

			if (value != null) {
				map.remove(key);
			} else {
				map.put(key, 0);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			key = entry.getKey();
		}

		return key;
	}

}