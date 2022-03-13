/*
        Binary Search Algorithm
 Array={1,2,3,4,5,6,7,8,9,10} target is 9
Index-> 0 1 2 3 4 5 6 7 8 9
    Step I-> take the middle element. Here it is 4th index.
    Step II-> take the target element. if(target>mid element)=> search in right, else-> left
    Step II-> if(target==mid element), return index
            */
package binarysearch.onedarray;

// FOR SORTED IN ASCENDING ORDER
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 69, 420, 512, 555};
        int target = 2;
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