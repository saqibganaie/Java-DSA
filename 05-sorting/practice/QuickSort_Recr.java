import java.util.Arrays;

public class QuickSort_Recr {
    public static void main(String[] args) {
        int[] nums = { 4, 1, -1, 2, 0, 3 };
        System.out.println(Arrays.toString(nums));
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));

    }

    // Not Stable Algorithm
    // In-Place Algorithm i.e why it is preferred for arrays instead of Merge Sort .
    // Merge takes O(N) extra space
    // Merge Sort is better in linked list due to memory allocation-> not continuous

    // * Time Complexity -> worst case - O(N^2) , Best Case -> O(NlogN)
    // * Space complexity -> O(1)
    // * Working of Algorithm
    // 1. Take a pivot element. (You can take any element as Pivot)
    // 2. After the first pass all the elements less than pivot will be on the L.H.S
    // of pivot and all the elements greater than pivot will be on the R.H.S of
    // pivot. (i.e the pivot will be at the correct position)
    // 3. Using recursion we will then divide the L.H.S and R.H.S further and begin
    // from step 1 again.

    // * Recurrence relation of Quick Sort - T(N) = T(K) + T(N - K - 1) + O(N)

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];
        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        // now my pivot is at correct index, please two halves now
        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
