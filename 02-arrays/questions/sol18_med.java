import java.util.Arrays;

public class sol18_med {
    // Q:Given an array of integers nums sorted in non-decreasing order, find the
    // starting and ending position of a given target value.
    // If target is not found in the array, return [-1, -1].
    // You must write an algorithm with O(log n) runtime complexity.
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 3, 3, 6 };
        System.out.println(Arrays.toString(searchRange(arr, 3)));
        System.out.println(Arrays.toString(searchRange(arr, 12)));
    }

    public static int[] searchRange(int[] nums, int target) {
        return new int[] { binarySearch(nums, target, false), binarySearch(nums, target, true) };
    }

    public static int binarySearch(int[] arr, int target, boolean lastIndex) {
        int index = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                index = mid;
            if (lastIndex) {
                if (arr[mid] > target)
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (arr[mid] < target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return index;
    }

}
