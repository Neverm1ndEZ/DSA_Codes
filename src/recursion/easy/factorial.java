package recursion.easy;

public class factorial {
    public static void main(String[] args) {
        System.out.println(factor(5));
    }

    static int factor(int n) {
        if (n <= 1) return 1;
        else return n * factor(n - 1);
    }
}