import java.util.Arrays;

// * Stable sorting algorithm is an algo where the original order is maintained after the sorting
// * Unstable sorting algorithm is an algo where the original order is not maintained after the sorting
public class BubbleSort1 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, -3, 4, -5, 0 };
        // bubbleSort(nums);
        // System.out.println(Arrays.toString(nums));
    }

    // Bubble sort a.k.a sinking sort / exchange sort
    // Bubble sort is a stable sorting algorithm
    // * Time complexity - best case {O(n)}, worst case {O(n^2)}
    /*
     * Space complexity- O(1) i.e no extra space required a.k.a inplace sorting
     * algorithm
     */
    // * Working of Algorithm
    // 1. sort adjacent elements till n
    // 2. after the first pass the largest element will be at the end
    // 3. now sort adjacent elemets till n - 1
    // 4. after the second pass the second larget element will be at the second
    // last position
    // 5. keep on doing this until you get the result

    public static void bubbleSort(int[] arr) {
        boolean swapped; // flag if no element was swapped
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) { // no swap occured that means the array is sorted
                return;
            }
        }
    }

    // swap function
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}