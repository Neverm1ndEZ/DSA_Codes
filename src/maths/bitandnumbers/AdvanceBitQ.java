/*    About XOR(^)
       A    B     res
       0    0      0
       0    1      1
       1    0      1
       1    1      0
        i) 5^5=0
        ii) 0^n=n
    */
package maths.bitandnumbers;

public class AdvanceBitQ {
    public static void main(String[] args) {
        int[] a = {5, 4, 1, 4, 3, 5, 1};
        int[] b = {5, 4, 1, 4, 3, 5, 1, 2};
        int[] c = {5, 4, 5, 3, 4, 5, 4};
        System.out.println(Rep(a));
        Rep2(b);
        //System.out.println(Rep3(c));
    }

    // Q1. Find the only non repeating element in an array where all the elements repeats twice
    static int Rep(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res ^= arr[i];
        }
        return res;
    }

    // Q2. Find the two non repeating element in an array where all the elements repeats twice
    static void Rep2(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum ^= arr[i];
        }
        sum = (sum & -sum);

        // sum1 and sum2 will contains 2 unique
        // elements elements initialized with 0 box
        // number xored with 0 is number itself
        int sum1 = 0;
        int sum2 = 0;

        // traversing the array again
        for (int i = 0; i < arr.length; i++) {

            // Bitwise & the arr[i] with the sum
            // Two possibilities either result == 0
            // or result > 0
            if ((arr[i] & sum) > 0) {

                // if result > 0 then arr[i] xored
                // with the sum1
                sum1 = (sum1 ^ arr[i]);
            } else {
                // if result == 0 then arr[i]
                // xored with sum2
                sum2 = (sum2 ^ arr[i]);
            }
        }
        // print the the two unique numbers
        System.out.println("The non-repeating elements are "
                + sum1 + " and " + sum2);
    }
    // Q3. Find the only non repeating element in an array where all the elements repeats thrice.
//    static int Rep3(int[] arr){
//
//    }

}