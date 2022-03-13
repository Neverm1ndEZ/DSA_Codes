package binarysearch.onedarray;

// mountain array={1,2,5,6,7,4,3}
public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 3, 2, 1};
        int target = 3;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int peak = peakIndexinMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // else try BS in other half
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    static int peakIndexinMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in dec part of the array
                // this may be the ans but look left
                // this is why end!=mid-1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 elem > mid element
            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

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