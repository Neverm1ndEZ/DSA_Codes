package binarysearch.twodarray;

import java.util.Arrays;

public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50},
        };
        System.out.println(Arrays.toString(search(arr, 37)));
    }

    static int[] search(int[][] mat, int target) {
        int row = 0;
        int col = mat.length - 1;

        while (row < mat.length && col >= 0) {
            if (mat[row][col] == target) {
                return new int[]{row, col};
            }
            if (mat[row][col] < target) row++;
            else col--;
        }
        return new int[]{-1, -1};
    }
}