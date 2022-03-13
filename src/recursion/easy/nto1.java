package recursion.easy;

public class nto1 {
    public static void main(String[] args) {
        funrev(5);
    }

    static void fun(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        fun(n - 1);
    }

    static void funrev(int n) {
        if (n == 0) return;
        funrev(n - 1);
        System.out.print(n + " ");
    }
}