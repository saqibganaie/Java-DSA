import java.util.Arrays;

public class MergeSort_Recr {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 8, 2, 0, -1 };
        System.out.println(Arrays.toString(arr));
        // mergeSort_divide(arr, 0, arr.length - 1);
        // arr = mergeSort_divide(arr);
        divide(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    // * Time Complexity -> worst case - O(N*log(N))
    // * Space complexity (for non in place algorithm) -> O(N)
    // (for in place algorithm) -> O(1)
    // * Working of Algorithm (works on the principal of Divide and Conquer)
    // 1. Divide the array till every element is sperated individually.
    // 2. Start merging the array and while you do it, sort it too.

    // * Another type of implementation of Merge Sort
    public static void divide(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }
        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid, end);
        merge(arr, start, mid, end);

    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] mergedArr = new int[end - start];
        int leftIndex = start;
        int rightIndex = mid;
        int mainIndex = 0;
        while (leftIndex < mid && rightIndex < end) {
            if (arr[leftIndex] < arr[rightIndex]) {
                mergedArr[mainIndex] = arr[leftIndex];
                leftIndex++;
            } else {
                mergedArr[mainIndex] = arr[rightIndex];
                rightIndex++;
            }
            mainIndex++;
        }
        while (leftIndex < mid) {
            mergedArr[mainIndex] = arr[leftIndex];
            leftIndex++;
            mainIndex++;
        }
        while (rightIndex < end) {
            mergedArr[mainIndex] = arr[rightIndex];
            rightIndex++;
            mainIndex++;
        }
        for (int i = 0; i < mergedArr.length; i++) {
            arr[start + i] = mergedArr[i];
        }
    }

    // * code for algorithm using O(n) space complexity
    // first we divide the array.
    public static int[] mergeSort_divide(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] leftArr = mergeSort_divide(Arrays.copyOfRange(arr, 0, mid));
        int[] rightArr = mergeSort_divide(Arrays.copyOfRange(arr, mid, arr.length));
        return mergeSort_merge(leftArr, rightArr);
    }

    // merging and sorting the divided arrays.
    public static int[] mergeSort_merge(int[] firstArr, int[] secondArr) {
        int leftIndex = 0;
        int rightIndex = 0;
        int mainIndex = 0;
        int[] mergedArr = new int[firstArr.length + secondArr.length];
        while (leftIndex < firstArr.length && rightIndex < secondArr.length) {
            if (firstArr[leftIndex] < secondArr[rightIndex]) {
                mergedArr[mainIndex] = firstArr[leftIndex];
                leftIndex++;
            } else {
                mergedArr[mainIndex] = secondArr[rightIndex];
                rightIndex++;
            }
            mainIndex++;
        }
        while (leftIndex < firstArr.length) {
            mergedArr[mainIndex] = firstArr[leftIndex];
            leftIndex++;
            mainIndex++;
        }
        while (rightIndex < secondArr.length) {
            mergedArr[mainIndex] = secondArr[rightIndex];
            rightIndex++;
            mainIndex++;
        }
        return mergedArr;
    }

}