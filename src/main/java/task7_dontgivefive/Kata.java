package task7_dontgivefive;

public class Kata {
    public static int dontGiveMeFive(int start, int end) {
        int number = 0;
        for (int i = start; i <= end; i++) {
            String stringNumber = String.valueOf(i);
            if (!stringNumber.contains("5")) {
                number++;
            }
        }
        return number;
    }
}
