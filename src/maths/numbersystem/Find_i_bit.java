package maths.numbersystem;

public class Find_i_bit {
    static void printKthBit(long n, long k) {
        System.out.println(
                ((n & (1L << (k - 1))) >> (k - 1)));
    }

    // Driver Code
    public static void main(String[] args) {
        long n = 13, k = 1;

        // Function Call
        printKthBit(n, k);
    }
}