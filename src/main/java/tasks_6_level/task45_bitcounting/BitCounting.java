package tasks_6_level.task45_bitcounting;

public class BitCounting {

    public static int countBits(int n){
        // Convert the number to a binary string
        String binaryString = Integer.toBinaryString(n);
        System.out.println(binaryString);

        // Count the number of units in the binary string
        int count = (int) binaryString.chars().filter(c -> c == '1').count();

        return count;
    }

}