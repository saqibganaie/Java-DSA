import java.util.Arrays;

public class SelectionSort2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        seletionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    // Selection sort is an unstable algorithm
    // It performs well for small lists
    // * Time complexity - best case {O(n ^ 2)}, worst case {O(n^2)}
    /*
     * Space complexity- O(1) i.e no extra space required a.k.a inplace sorting
     * algorithm
     */
    // * Working of Algorithm
    // 1. find greatest or smallest element
    // 2. put it in it's correct position by swapping it with the element at it's
    // correct position.
    // 3. repeat until you get a sorted array
    public static void seletionSort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int lastIndex = size - 1 - i;
            int maxIndex = getMaxIndex(arr, 0, size - i);
            swap(arr, maxIndex, lastIndex);
        }
    }

    // to find the index of max number in array
    public static int getMaxIndex(int[] arr, int start, int end) {
        int maxNum = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = start; i < end; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // swap function
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
