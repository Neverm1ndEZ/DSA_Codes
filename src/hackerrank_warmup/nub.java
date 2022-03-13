package hackerrank_warmup;

import java.util.ArrayList;
import java.util.Scanner;

public class nub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6, sum = 0;
        int in = 0;
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        for (int i = 1; i <= n; i++) {
            in = sc.nextInt();
            list.add(in);
        }
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}