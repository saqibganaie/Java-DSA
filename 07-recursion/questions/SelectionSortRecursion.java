import java.util.Arrays;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 8, 1 };
        rSelectionSort(arr, 0, 0, arr.length);
        // selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        // System.out.println(getMaxIndex(arr, arr.length - 1));
    }

    // Recursive Selection sort
    public static void rSelectionSort(int[] arr, int maxIndex, int currIndex, int lastIndex) {
        if (lastIndex == 0) {
            return;
        }
        if (currIndex < lastIndex) {
            if (arr[maxIndex] < arr[currIndex]) {
                maxIndex = currIndex;
            }
            rSelectionSort(arr, maxIndex, currIndex + 1, lastIndex);
        } else {
            swap(arr, maxIndex, lastIndex);
            rSelectionSort(arr, 0, 0, lastIndex - 1);
        }

    }

    // Normal Selection Sort
    public static void selectionSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            int maxIndex = getMaxIndex(arr, i);
            swap(arr, maxIndex, i);
        }
    }

    // max index using recursion
    // public static int getMaxRecursion(int[] arr, int max, int currIndex, int
    // lastIndex) {
    // if (currIndex == lastIndex) {
    // return max;
    // }
    // if (arr[max] < arr[currIndex]) {
    // return getMaxRecursion(arr, currIndex, currIndex + 1, lastIndex);
    // } else {
    // return getMaxRecursion(arr, max, currIndex + 1, lastIndex);
    // }
    // }

    // max index
    public static int getMaxIndex(int[] arr, int lastIndex) {
        int maxIndex = 0;
        for (int i = 1; i <= lastIndex; i++) {
            if (arr[maxIndex] < arr[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // swap element
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
