package hackerrank_warmup;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=false
public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        plusMinus(arr);
    }

    static void plusMinus(int[] arr) {
        int countPlus = 0, countMinus = 0, countZero = 0, n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                countPlus++;
            } else if (arr[i] < 0) {
                countMinus++;
            } else {
                countZero++;
            }
        }

        System.out.printf("%.6f \n", (double) countPlus / (double) n);
        System.out.printf("%.6f \n", (double) countMinus / (double) n);
        System.out.printf("%.6f \n", (double) countZero / (double) n);
    }

}