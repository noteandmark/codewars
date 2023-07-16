package tasks_4_level.task38_nextbiggernumber;

import java.util.Arrays;

public class Kata {
	public static long nextBiggerNumber(long number) {
	    // Step 1: Convert the number to an array of digits
	    char[] digits = String.valueOf(number).toCharArray();

	    // Step 2: Find the pivot digit
	    int pivotIndex = -1;
	    for (int i = digits.length - 2; i >= 0; i--) {
	        if (digits[i] < digits[i + 1]) {
	            pivotIndex = i;
	            break;
	        }
	    }

	    // Step 3: If no pivot digit is found, return -1
	    if (pivotIndex == -1) {
	        return -1;
	    }

	    // Step 4: Find the swap digit
	    int swapIndex = -1;
	    for (int i = digits.length - 1; i > pivotIndex; i--) {
	        if (digits[i] > digits[pivotIndex]) {
	            swapIndex = i;
	            break;
	        }
	    }

	    // Step 5: Swap the pivot digit with the swap digit
	    char temp = digits[pivotIndex];
	    digits[pivotIndex] = digits[swapIndex];
	    digits[swapIndex] = temp;

	    // Step 6: Sort the digits to the right of the pivot digit in ascending order
	    Arrays.sort(digits, pivotIndex + 1, digits.length);

	    // Step 7: Concatenate the digits to form the next larger number
	    String nextNumberStr = new String(digits);

	    // Step 8: Convert the string to an integer and return it
	    return Long.parseLong(nextNumberStr);
	}
}
