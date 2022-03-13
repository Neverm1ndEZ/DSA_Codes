package hackerrank_warmup;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/compare-the-triplets/problem?h_r=next-challenge&h_v=zen
public class HackerRankTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[3];
        for (int i = 0; i < a.length; i++) {
            b[i] = sc.nextInt();
        }
        compareTriplet(a, b);
    }

    static void compareTriplet(int[] a, int[] b) {
        int countA = 0, countB = 0;
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) countA++;
            else if (a[i] == b[i]) countA += 0;
            else countB++;
        }
        System.out.println(countA + " " + countB);
    }
}