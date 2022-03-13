package tasks_8_7_level.task6_highestandlowest;

public class Kata {
    public static String highAndLow(String numbers) {
        String[] valueString = numbers.split(" ");
        int[] value = new int[valueString.length];
        for (int i = 0; i < valueString.length; i++) {
            value[i] = Integer.parseInt(valueString[i]);
        }
        bubbleSort(value);
        return value[value.length-1] + " " + value[0];
    }

    private static void bubbleSort(int[] value) {
        for (int i = value.length-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (value[j] > value[j+1]) {
                    int tmp = value[j];
                    value[j] = value[j+1];
                    value[j+1] = tmp;
                }
            }
        }
    }
}
