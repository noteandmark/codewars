package tasks_8_7_level.task10_regexpincode;

public class Solution {

    public static boolean validatePin(String pin) {
        return (pin.matches("\\d+") || pin.matches("\\d")) && ((pin.length() == 4) || (pin.length() == 6));
    }

}
