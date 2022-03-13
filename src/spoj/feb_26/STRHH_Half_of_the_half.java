package spoj.feb_26;

import java.util.Scanner;

//  https://www.spoj.com/problems/STRHH/
public class STRHH_Half_of_the_half {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s = "";
        while (t > 0) {
            int i = 0;
            s = sc.next();
            if (s.length() <= 2) {
                for (; i < s.length() / 2; i = i + 2) {
                    System.out.print(s.charAt(i));
                }
                System.out.println();
            } else {
                for (; i < s.length() / 2; i = i + 2) {
                    System.out.print(s.charAt(i));
                }
                System.out.println();
            }
            --t;
        }
    }
}