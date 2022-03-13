package hackerrank_warmup;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/a-very-big-sum/problem
public class VeryBigSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLong();
        }
        System.out.println(veryBigSum(a));
    }

    static long veryBigSum(long[] a) {
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}