package hackerrank_warmup;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/mini-max-sum/problem?h_r=next-challenge&h_v=zen
public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long sum = 0;
        long min = 1000000000;
        long max = 0;
        while (scan.hasNext()) {
            long n = scan.nextLong();
            sum = sum + n;
            if (min > n) {
                min = n;
            }
            if (max < n) {
                max = n;
            }
        }
        scan.close();

        System.out.println((sum - max) + " " + (sum - min));
    }
}