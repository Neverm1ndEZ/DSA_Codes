// Sieve of Eratosthenes
// to check if N is a prime no.
// condition, no factor from (1 to root N]
// normally used in pre-processing, like find prime no.s bet 1-12
// create a boolean array of size n+1
// enter the range u want to find prime no.s of
// mark every number true except 0 and 1
// iterate from 2 to N
package maths.mathsforCP;

import java.util.Arrays;

public class SeiveofEratosthenes {
    static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];

        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            for (int j = 2 * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        boolean[] isPrime = sieveOfEratosthenes(69);
        for (int i = 0; i <= 69; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}