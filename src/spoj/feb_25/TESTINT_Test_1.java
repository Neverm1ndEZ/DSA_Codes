package spoj.feb_25;

import java.util.Scanner;

//https://www.spoj.com/problems/TESTINT/
public class TESTINT_Test_1 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > 200 && b > 200) {
                break;
            }
            System.out.println(a + b);
            break;
        }
    }
}