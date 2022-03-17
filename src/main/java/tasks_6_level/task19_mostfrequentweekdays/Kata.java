package tasks_6_level.task19_mostfrequentweekdays;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class Kata {
    public static String[] mostFrequentDays(int year) {

        DayOfWeek[] arr = getDayOfWeeks(year);

        return Arrays.stream(arr)
                .map(s -> s.toString())
                .map(s -> s.substring(0, 1) + s.substring(1).toLowerCase())
                .toArray(String[]::new);
    }

    private static DayOfWeek[] getDayOfWeeks(int year) {
        LocalDate startDate = LocalDate.of(year, 1, 1);
        LocalDate endDate = LocalDate.of(year + 1, 1, 1);

        HashMap<DayOfWeek, Integer> map = new HashMap<>();

        for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            map.put(dayOfWeek, map.getOrDefault(dayOfWeek, 1) + 1);
        }

        Integer max = Collections.max(map.values());

        ArrayList<DayOfWeek> result = new ArrayList<>();

        for (Map.Entry<DayOfWeek, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(max)) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result, Comparator.comparing(DayOfWeek::getValue));

        DayOfWeek[] arr = new DayOfWeek[result.size()];
        arr = result.toArray(arr);
        return arr;
    }
}
