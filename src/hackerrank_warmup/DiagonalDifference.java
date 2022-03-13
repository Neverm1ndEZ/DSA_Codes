package hackerrank_warmup;
// https://www.hackerrank.com/challenges/diagonal-difference/problem?h_r=next-challenge&h_v=zen

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumofLD = 0, sumofNLD = 0;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sumofLD += a[i][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) == (n - 1)) {
                    sumofNLD += a[i][j];
                }
            }
        }

        int ans = Math.abs(sumofLD - sumofNLD);

        System.out.println(ans);
    }
}