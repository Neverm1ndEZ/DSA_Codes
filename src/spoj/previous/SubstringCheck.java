package spoj.previous;

import java.util.Scanner;

// https://www.spoj.com/problems/SBSTR1/
public class SubstringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.nextLine();

        System.out.println(Substring(A, B));

    }

    static int Substring(String A, String B) {
        for (int i = 0; i < A.length() - B.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                if (A.charAt(i + j) == B.charAt(j)) {
                    return 1;
                }
            }
        }
        return 0;
    }

}