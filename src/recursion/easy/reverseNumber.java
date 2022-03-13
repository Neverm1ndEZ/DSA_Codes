package recursion.easy;

public class reverseNumber {
    static int sum = 0;

    public static void main(String[] args) {
        rev(125);
        System.out.println(sum);
    }

    static void rev(int n) {
        int rem = n % 10;
        if (n == 0) return;
        else sum = sum * 10 + rem;
        rev(n / 10);
    }
}