package binarysearch.onedarray;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 12, 15, 18, 20, 23, 26, 28, 69, 420};
        int target = 15;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        // find the range
        int start = 0;
        int end = 1;
        //condition: target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1;
            //double to box value
            //emd = previous end + sizeofBox*2;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
//            int mid=(start+end)/2; //can give errors for big int value
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}