package binarysearch.twodarray;

import java.util.Scanner;

// https://www.interviewbit.com/problems/multidimensional-arrays/
public class FindSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int col = 0; col < m; col++) {
            for (int row = 0; row < n; row++) {
                sum += arr[row][col];
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}