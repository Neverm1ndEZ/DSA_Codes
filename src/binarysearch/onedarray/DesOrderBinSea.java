package binarysearch.onedarray;

// FOR ARRAY SORTED IN DESCENDING ORDER
public class DesOrderBinSea {
    public static void main(String[] args) {
        int[] arr = {555, 512, 420, 69, 5, 4, 3, 2, 1};
        int target = 420;
        System.out.println(binarySearch(arr, target));
    }

    //return index if element found else return -1.
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
//            int mid=(start+end)/2; //can give errors for big int value
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
