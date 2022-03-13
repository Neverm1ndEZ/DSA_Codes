package linearsearch;

public class EvenDigits {
    public static void main(String[] args) {

    }

    static int findNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        return true;
    }
}
