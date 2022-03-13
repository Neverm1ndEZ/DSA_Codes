package hackerrank_warmup;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/staircase/problem?h_r=next-challenge&h_v=zen
public class Staircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rightStaircase(n);
        //leftStaircase(n);
    }

    static void rightStaircase(int n) {
        for (int row = 0; row < n; row++) {
            int c = n - row - 1;
            System.out.print("");
            for (int col = 0; col < n; col++) {
                if (col < c) System.out.print(" ");
                else System.out.print("#");
            }
            System.out.println();
            c--;
        }
    }

    static void leftStaircase(int n) {
        for (int row = 0; row < n; row++) {
            System.out.print("");
            for (int col = 0; col <= row; col++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}