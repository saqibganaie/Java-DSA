import java.util.Arrays;

public class InsertionSort3 {
    public static void main(String[] args) {
        int[] arr = { -1, -2, -3, 0, 0, -1, -2, 1, 2, 5, 4, 3 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    // Insertion sort is stable algorithm
    // * It is adaptive i.e steps get reduced if array is already sorted
    // * Number of swaps are reduced as compared to bubble sort
    // Used for small size lists
    // * Works good with arrays that are partially sorted
    // It takes part in hybrid sorting algorithms
    // * Time complexity - best case {O(n)}, worst case {O(n^2)}
    /*
     * Space complexity- O(1) i.e no extra space required a.k.a inplace sorting
     * algorithm
     */
    // * Working of Algorithm
    // 1. We start from index 1 element and put it in it's correct position in
    // LHS array.
    // 2. Then we move to index 2 and so on.
    // 3. With each pass the LHS array will be sorted till currIndex - 1 elements
    public static void insertionSort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
