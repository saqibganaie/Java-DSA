import javax.swing.SpringLayout;

public class QuesArrays {

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 1, 2, 3 };
        // System.out.println(isSorted(arr, 0));
        // System.out.println(search(arr, 44, 0));
        System.out.println(rrSearch(arr, 1, 0, arr.length - 1));
    }

    // Q. rotated binary search using recursion
    public static int rrSearch(int[] arr, int key, int start, int end) {
        int mid = start + ((end - start) / 2);
        if (start > end) {
            return -1;
        }
        if (arr[mid] == key) {
            return mid;
        }
        if (arr[mid] >= arr[start]) {
            if (key >= arr[start] && key <= arr[mid]) {
                return rrSearch(arr, key, start, mid - 1);
            } else {
                return rrSearch(arr, key, mid + 1, end);
            }
        }
        if (key >= arr[mid] && key <= arr[end]) {
            return rrSearch(arr, key, mid + 1, end);
        }
        return rrSearch(arr, key, start, mid - 1);
    }

    // Q. Normal rotated Binary search
    public static int rotatedBS(int[] arr, int key) {
        int pivotIndex = getPivotIndex(arr);
        if (key < arr[0]) {
            return binarySearch(arr, key, pivotIndex, arr.length - 1);
        }
        return binarySearch(arr, key, 0, pivotIndex - 1);

    }

    public static int getPivotIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] < arr[mid + 1] && arr[mid] < arr[mid - 1]) {
                return mid;
            }
            if (arr[mid] > arr[0]) {
                start = mid + 1;
            } else if (arr[mid] < arr[0]) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int key, int index1, int index2) {
        int start = index1;
        int end = index2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            }
        }
        return -1;
    }

    // Q2. Linear Search with recursion
    public static int search(int[] arr, int key, int index) {
        if (index >= arr.length) {
            return -1;
        }
        // if (arr[index] == key) {
        // return index;
        // }
        return arr[index] == key ? index : search(arr, key, index + 1);

    }

    // Q1. Check if array is sorted
    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        // if (arr[index] <= arr[index + 1]) {
        // return isSorted(arr, index + 1);
        // } else {
        // return false;
        // }
        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }
}
