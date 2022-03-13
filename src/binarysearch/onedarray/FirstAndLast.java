package binarysearch.onedarray;

public class FirstAndLast {
    public static void main(String[] args) {

    }

    static int[] searchRange(int[] arr, int target) {
        int[] ans = {-1, -1};
        // check for first occurrence of the target.
        int start = search(arr, target, true);
        int end = search(arr, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // this function return the index of target.
    static int search(int[] arr, int target, boolean startIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
//            int mid=(start+end)/2; //can give errors for big int value
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // potential answer found.
                ans = mid;
                if (startIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}