package maths.mathsforCP;

public class ModuloArithmetics {
    static int fastPower(int a, int b) {
        int res = 1;
        while (b > 0) {
            if (b % 2 != 0) {
                res = res * a;
            }
            a *= a;
            b /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(fastPower(8, 3));
    }
}