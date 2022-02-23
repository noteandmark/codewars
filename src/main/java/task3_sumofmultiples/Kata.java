package task3_sumofmultiples;

public class Kata {
    public static long sumMul(int n, int m) {
        System.out.println("n = " + n + " m = " + m);
        int sum = 0;
        int firstArg;
        if (n > 0 && m > 0) {
            if (m < n) return sum;
            firstArg = n;
            while (n < m) {
                System.out.println("before n = " + n + "; sum = " + sum);
                sum += n;
                n += firstArg;
                System.out.println("after n = " + n + "; sum = " + sum);
            }
        } else throw new IllegalArgumentException("wrong condition");
        return sum;
    }
}
