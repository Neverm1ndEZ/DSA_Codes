package recursion.easy;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(SOD(1342));
    }

    static int SOD(int n) {
        if (n == 0) return 0;
        else return (n % 10) + SOD(n / 10);
    }
}