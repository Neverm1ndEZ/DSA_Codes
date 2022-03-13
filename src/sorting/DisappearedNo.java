package sorting;
// Tips:
// -> IF RANGE IS [0,N], THEN INDEX = VALUE
// -> IF RANGE IS [1,N], THEN INDEX = VALUE - 1

public class DisappearedNo {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        sort(arr);
        // find the missing no
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != (index + 1)) {
                System.out.print((index + 1) + " ");
            }
        }

    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}