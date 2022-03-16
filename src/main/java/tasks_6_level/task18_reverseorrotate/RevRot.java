package tasks_6_level.task18_reverseorrotate;

import java.util.ArrayList;

public class RevRot {
    public static String revRot(String strng, int sz) {
        if (strng.isEmpty() || sz <= 0 || sz > strng.length()) return "";
        ArrayList<String> chunk = chunked(strng, sz);
        StringBuilder result = new StringBuilder();
        for (String element : chunk) {
            if (checkedDivisibleTwo(element)) {
                element = reverseElement(element);
            } else {
                element = rotateElement(element);
            }
            result.append(element);
        }
        return result.toString();
    }

    private static boolean checkedDivisibleTwo(String element) {
        int sum = 0;
        for (int i = 0; i < element.length(); i++) {
            int n = Character.getNumericValue(element.charAt(i));
            sum += n;
        }
        return sum % 2 == 0;
    }

    private static String rotateElement(String element) {
        String first = element.substring(0, 1);
        String second = element.substring(1, element.length());
        return second + first;
    }

    private static String reverseElement(String element) {
        StringBuilder input = new StringBuilder();
        input.append(element);
        input.reverse();
        return input.toString();
    }

    private static ArrayList<String> chunked(String strng, int sz) {
        ArrayList<String> chunk = new ArrayList<>();
        int start = 0;
        int end = sz;
        while (((strng.length() - start) % sz > 0) || ((strng.length() - start) >= sz)) {
            chunk.add(strng.substring(start, end));
            start = sz + start;
            if (strng.length() - start >= sz) {
                end += sz;
            }
        }
        return chunk;
    }
}
