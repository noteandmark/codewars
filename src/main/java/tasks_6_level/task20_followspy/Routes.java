package tasks_6_level.task20_followspy;

import java.util.ArrayList;
import java.util.List;

public class Routes {
    public String findRoutes(String[][] routes) {

        List<String> startPoint = new ArrayList<>();
        List<String> endPoint = new ArrayList<>();

        for (String[] route : routes) {
            for (int j = 0; j < route.length; j++) {
                if (j == 0) {
                    startPoint.add(route[j]);
                } else {
                    endPoint.add(route[j]);
                }
            }
        }

        String start = getStart(startPoint, endPoint); // found start point
        String end = getEnd(endPoint, startPoint); // found end point

        String iterator = "";
        String next;
        StringBuilder result = new StringBuilder();

        while (!iterator.equals(end)) {
            for (int i = 0; i < startPoint.size(); i++) {
                if (startPoint.get(i).equals(start)) {
                    result.append(startPoint.get(i));
                    result.append(", ");
                    next = endPoint.get(i);
                    if (next.equals(end)) {
                        iterator = end;
                        result.append(end);
                    } else {
                        start = next;
                    }
                }
            }
        }

        return result.toString();
    }

    private String getEnd(List<String> endPoint, List<String> startPoint) {
        List<String> endList = new ArrayList<>(endPoint);
        endList.removeAll(startPoint);
        return endList.get(0);
    }

    private String getStart(List<String> startPoint, List<String> endPoint) {
        List<String> startList = new ArrayList<>(startPoint);
        startList.removeAll(endPoint);
        return startList.get(0);
    }
}