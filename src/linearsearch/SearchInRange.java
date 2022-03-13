package linearsearch;

// searching for some element in an arr for a given index.
public class SearchInRange {
    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] n = {5, 6, 9, 7, 8, 66, 69, 420, 55, 47, 26};
        int tar = 420;
        System.out.println(linearSearch(n, tar, 5, n.length));
    }
}