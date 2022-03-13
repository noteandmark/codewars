package tasks_8_7_level.task12_vowelcount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(str);
        while (m.find()) {
            vowelsCount++;
        }
        return vowelsCount;
    }

}
