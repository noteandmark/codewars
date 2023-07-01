package tasks_5_level.task30_factorialdecomposition;

import java.math.BigInteger;

public class FactDecomp {

	private static final int MAX_CACHE_SIZE = 10000; // Maximum size of the factorial cache
	private static final BigInteger[] factorialCache = new BigInteger[MAX_CACHE_SIZE]; // Cache to store factorials

	public static String decomp(int n) {
		StringBuilder decomposition = new StringBuilder();

		// Calculate the prime factors and their powers
		for (int p = 2; p <= n; p++) {
			if (isPrime(p)) {
				int count = getPrimePower(n, p);

				if (count > 0) {
					if (decomposition.length() > 0) {
						decomposition.append(" * ");
					}

					decomposition.append(p);

					if (count > 1) {
						decomposition.append("^").append(count);
					}
				}
			}
		}

		return decomposition.toString();
	}

	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static int getPrimePower(int n, int p) {
		int power = 0;

		while (n > 0) {
			n /= p;
			power += n;
		}

		return power;
	}

	// The second solution, but again reached the server time limit with the
	// Execution Timed Out (16000 ms) error.
//	private static final int MAX_CACHE_SIZE = 10000; // Maximum size of the factorial cache
//	private static final BigInteger[] factorialCache = new BigInteger[MAX_CACHE_SIZE]; // Cache to store factorials
//
//	public static String decomp(int n) {
//		StringBuilder decomposition = new StringBuilder();
//		BigInteger factorial = calculateFactorial(n);
//		BigInteger originalFactorial = factorial; // Store the original factorial value
//
//		BigInteger p = BigInteger.valueOf(2);
//
//		while (p.compareTo(originalFactorial) <= 0) { // Use originalFactorial in the loop condition
//			int count = 0;
//
//			while (factorial.remainder(p).equals(BigInteger.ZERO)) {
//				factorial = factorial.divide(p);
//				count++;
//
//				originalFactorial = factorial; // Update originalFactorial inside the while loop
//			}
//
//			if (count > 0) {
//				if (decomposition.length() > 0) {
//					decomposition.append(" * ");
//				}
//
//				decomposition.append(p);
//
//				if (count > 1) {
//					decomposition.append("^").append(count);
//				}
//			}
//
//			p = p.add(BigInteger.ONE);
//		}
//
//		return decomposition.toString();
//	}
//
//	public static BigInteger calculateFactorial(int n) {
//		if (n < MAX_CACHE_SIZE && factorialCache[n] != null) {
//			return factorialCache[n]; // Return cached factorial if available
//		}
//
//		BigInteger factorial = BigInteger.ONE;
//
//		if (n < MAX_CACHE_SIZE) {
//			// Calculate factorial and store it in the cache
//			for (int i = 2; i <= n; i++) {
//				factorial = factorial.multiply(BigInteger.valueOf(i));
//				factorialCache[i] = factorial;
//			}
//		} else {
//			// Calculate factorial without caching
//			for (int i = 2; i <= n; i++) {
//				factorial = factorial.multiply(BigInteger.valueOf(i));
//			}
//		}
//
//		return factorial;
//	}

	// First implementation without calculation time
//	public static String decomp(int n) {
//
//		StringBuilder decomposition = new StringBuilder();
//		BigInteger factorial = calculateFactorial(n);
//		BigInteger originalFactorial = factorial; // Store the original factorial value
//
//		BigInteger p = BigInteger.valueOf(2);
//
//		while (p.compareTo(originalFactorial) <= 0) { // Use originalFactorial in the loop condition
//			int count = 0;
//
//			while (factorial.remainder(p).equals(BigInteger.ZERO)) {
//				factorial = factorial.divide(p);
//				count++;
//
//				originalFactorial = factorial; // Update originalFactorial inside the while loop
//			}
//
//			if (count > 0) {
//				if (decomposition.length() > 0) {
//					decomposition.append(" * ");
//				}
//
//				decomposition.append(p);
//
//				if (count > 1) {
//					decomposition.append("^").append(count);
//				}
//			}
//
//			p = p.add(BigInteger.ONE);
//		}
//
//		System.out.println("for n = " + n + " decomposition = " + decomposition.toString());
//		return decomposition.toString();
//
//	}
//
//	public static BigInteger calculateFactorial(int n) {
//		BigInteger factorial = BigInteger.ONE;
//
//		for (int i = 2; i <= n; i++) {
//			factorial = factorial.multiply(BigInteger.valueOf(i));
//		}
//
//		return factorial;
//
//	}
}
