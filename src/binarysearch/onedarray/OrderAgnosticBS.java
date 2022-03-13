package binarysearch.onedarray;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 69, 420, 512, 555};
        int target = 69;
        System.out.println(orderAgnosticBS(arr, target));
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted or not
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
//            int mid=(start+end)/2; //can give errors for big int value
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            //ascending
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            //descending
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}