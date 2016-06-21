package pl.wiktordolecki;

import java.math.BigInteger;

/**
 * Fibonnaci sequence is given by recursive relation
 *
 * F[n+2] = F[n+1] + F[n]
 * with
 * F[0] = 0
 * F[1] = 1
 *
 * Implement function returning n-th element of Fibonnaci Sequence.
 *
 * 1. Implementation working in O(n) memory and time
 *
 * 2. Bonus task - Can you make it to have performance should be in O(log n) memory and time?
 */
public class Excercise03 {

	/** O(n) **/
    public static BigInteger fibonnaci(int n) {
    	return BigInteger.valueOf(findFibonacci(n));
    }
    
    /** O(n) Bad performance**/
    public static BigInteger fibonnaci2(int n) {
    	return BigInteger.valueOf(findFibonacci2(n));
    }
    
    /** O(log n) **/
    public static BigInteger fibonnaci3(int n) {
    	return BigInteger.valueOf(findFibonacci3(n));
    }
    
    
    private static long findFibonacci(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		long fibo1 = 1, fibo2 = 1, fibonacci = 1;
		for (int i = 3; i <= number; i++) {
			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;
		}
		return fibonacci;
	}
    
    
    private static long findFibonacci2(int n) {
		if (n <= 1)
			return n;
		return findFibonacci2(n - 1) + findFibonacci2(n - 2);
	}
    
    
	private static long findFibonacci3(int n) {
		long F[][] = new long[][] { { 1, 1 }, { 1, 0 } };
		if (n == 0)
			return 0;
		power(F, n - 1);

		return F[0][0];
	}

	private static void multiply(long F[][], long M[][]) {
		long x = F[0][0] * M[0][0] + F[0][1] * M[1][0];
		long y = F[0][0] * M[0][1] + F[0][1] * M[1][1];
		long z = F[1][0] * M[0][0] + F[1][1] * M[1][0];
		long w = F[1][0] * M[0][1] + F[1][1] * M[1][1];

		F[0][0] = x;
		F[0][1] = y;
		F[1][0] = z;
		F[1][1] = w;
	}

	private static void power(long F[][], int n) {
		if (n == 0 || n == 1)
			return;
		long M[][] = new long[][] { { 1, 1 }, { 1, 0 } };

		power(F, n / 2);
		multiply(F, F);

		if (n % 2 != 0)
			multiply(F, M);
	}
}
