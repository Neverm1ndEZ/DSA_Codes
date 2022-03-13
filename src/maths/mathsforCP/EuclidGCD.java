// Theory
// gcd (a, b) = gcd (a-b,b) where a>b
// keeping doing this recursively until a-b || b == 0
// the non zero no. will be gcd --> greatest common divisor or Highest common factor
//                OR
// gcd (a.b) = gcd (b, a % b) -> until a % b != 0

package maths.mathsforCP;

public class EuclidGCD {
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(69, 420));
    }
}