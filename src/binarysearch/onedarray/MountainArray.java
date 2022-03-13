package binarysearch.onedarray;

// mountain array={1,2,5,6,7,4,3}
public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 2, 0};
        System.out.println(peakIndexinMountainArray(arr));
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
}