package task9_halvingsum;

public class HalvingSum {
    int halvingSum(int n) {
        int sum = 0;
        while (n >= 1) {
            sum += n;
            n = n / 2;
        }
        return sum;
    }
}
