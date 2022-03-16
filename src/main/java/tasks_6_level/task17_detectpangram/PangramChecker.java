package tasks_6_level.task17_detectpangram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PangramChecker {
    public boolean check(String sentence){
        long c = sentence.toLowerCase().chars()
                .filter(ch -> ch >= 'a' && ch <= 'z')
                .distinct()
                .count();
        return c == 26;
    }
}
