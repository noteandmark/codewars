package task4_printererrors;

import java.util.Arrays;
import java.util.List;

public class Printer {
    public static String printerError(String s) {
        String result = null;
        int errorsCount = 0;
        List<String> printErrors = Arrays.asList("n","o","p","q","r","s","t","u","v","w","x","y","z");
        for (int i = 0;  i < s.length(); i++) {
            if (printErrors.contains(Character.toString(s.charAt(i)))) {
                errorsCount++;
            }
        }
        result = String.valueOf(errorsCount) + "/" + s.length();
        return result;
    }
}
