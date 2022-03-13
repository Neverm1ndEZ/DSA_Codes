/*
        Binary Search Algorithm
 Array={1,2,3,4,5,6,7,8,9,10} target is 9
Index-> 0 1 2 3 4 5 6 7 8 9
    Step I-> take the middle element. Here it is 4th index.
    Step II-> take the target element. if(target>mid element)=> search in right, else-> left
    Step II-> if(target==mid element), return index

   Ceiling-> greatest no. closest to target element
   floor-> smallest no. closest to target element

            */
package binarysearch.onedarray;

// FOR SORTED IN ASCENDING ORDER
public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 10, 12, 14, 16, 18, 69, 420, 512, 555};
        int target = 15;
        System.out.println(ceiling(arr, target));
    }

    //return index of ceiling
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //what if target is greater than greatest no. in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }

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
        return start;
    }
}