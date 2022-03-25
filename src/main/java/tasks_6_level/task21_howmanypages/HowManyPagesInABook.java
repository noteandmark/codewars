package tasks_6_level.task21_howmanypages;

public class HowManyPagesInABook {
    public static int amountOfPages(int summary) {
        int result = 0;
        int sum = 0;
        StringBuilder resultString = new StringBuilder();
        while (sum < summary) {
            result++;
            resultString.append(result);
            sum = resultString.length();
        }
        return result;
    }
}