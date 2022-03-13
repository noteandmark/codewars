package tasks_6_level.task14_deleteoccurrenceselement;

import java.util.HashMap;
import java.util.LinkedList;

public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        if (maxOccurrences == 0) return new int[0];
        HashMap<Integer, Integer> filterMap = new HashMap<>();
        LinkedList<Integer> resultList = new LinkedList<>();
        for (int i = 0; i < elements.length; i++) {
            if (filterMap.containsKey(elements[i])) {
                if (filterMap.get(elements[i]) < maxOccurrences) {
                    filterMap.put(elements[i], filterMap.get(elements[i]) + 1);
                    resultList.add(elements[i]);
                }
            } else {
                filterMap.put(elements[i], 1);
                resultList.add(elements[i]);
            }
        }
        Object[] objectAarray = resultList.toArray();
        int length = objectAarray.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = (Integer) objectAarray[i];
        }
        return result;
    }
}


/*

  not mine code, but I like it :

  public static int[] deleteNth(int[] elements, int max) {

    if (max < 1) return new int[0];

    final HashMap<Integer,Integer> map = new HashMap<>();
    final List<Integer> list = new ArrayList<>();

    for (final Integer i : elements) {
      final Integer v = map.put(i, map.getOrDefault(i, 0) + 1);
      if (v == null || v < max) list.add(i);
    }

    return list.stream().mapToInt(i->i).toArray();
  }
 */