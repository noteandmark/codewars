package tasks_8_7_level.task11_calculatestringrotation;

public class CalculateRotation {
    static int shiftedDiff(String first, String second) {
        int count = 0;
        String tmp = first;
        boolean find = false;
        if (!second.equals(first)) {
            for (int i = first.length(); i > 0; i--) {
                tmp = String.valueOf(first.charAt(i - 1)) + tmp.substring(0, i - 1 + count);
                count++;
                if (second.equals(tmp)) {
                    find = true;
                    break;
                }
            }
        } else find = true;
        if (find == false) {
            count = -1;
        }
        return count;
    }
}
