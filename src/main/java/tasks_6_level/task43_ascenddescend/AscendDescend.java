package tasks_6_level.task43_ascenddescend;

public class AscendDescend {
    public static String ascendDescend(int length, int minimum, int maximum) {
        if (length <= 0 || maximum < minimum) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int ref = minimum;
        int increment = 1;

        while (result.length() < length) {
            result.append(ref);

            if (result.length() == length) {
                break;
            }
            if (minimum != maximum) ref += increment;

            if ((increment > 0 && ref >= maximum) || (increment < 0 && ref <= minimum)) {
                increment *= -1;
            }
        }

        return result.substring(0, length);
    }
}
