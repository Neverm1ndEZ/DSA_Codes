package linearsearch;

// searching for some value in a given array
public class SearchInArray {
    // search in array: return the index if found. Else return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 8, 69, 420, 50, 55, 60, 65};
        int target = 61;
        System.out.println(linearSearch(num, target));
    }
}