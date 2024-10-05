package tasks_from_habr_nucleotide.task3;

import java.util.Arrays;

public class PrimeNumbers {

    public void consolePrimes() {
        int[] array = new int[99]; //create an array from 2 to 100 and check if the number is prime
        int index = 0;
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                array[index++] = i;
            }
        }

        int j = 0;
        while (array[j] != 0) {
            System.out.println(array[j]);
            j++;
        }
    }

    public static boolean isPrime(int i) {
        for (int k = 2; k <= i; k++) {
            if ((i != k) && (i % k == 0)) {
                return false;
            }
        }
        return true;
    }

}
