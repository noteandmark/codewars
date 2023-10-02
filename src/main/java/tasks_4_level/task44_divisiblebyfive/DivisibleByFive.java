package tasks_4_level.task44_divisiblebyfive;

import java.util.regex.Pattern;

public class DivisibleByFive {

    public static Pattern pattern() {
        return Pattern.compile("^(0|1(10)*(0|11)(01*0(1|0(10)*(0|11)))*1)+$");
    }
}
