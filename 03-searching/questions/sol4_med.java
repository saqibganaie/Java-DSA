import java.util.Arrays;

public class sol4_med {
    // Q: Given a 1-indexed array of integers numbers that is already sorted in
    // non-decreasing order, find two numbers such that they add up to a specific
    // target number. Let these two numbers be numbers[index1] and numbers[index2]
    // where 1 <= index1 < index2 <= numbers.length.
    // Return the indices of the two numbers, index1 and index2, added by one as an
    // integer array [index1, index2] of length 2.
    // The tests are generated such that there is exactly one solution. You may not
    // use the same element twice.
    // Your solution must use only constant extra space.

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        System.out.println(Arrays.toString(twoSum(arr, 9)));
        System.out.println(Arrays.toString(twoSumOptimized(arr, 9)));
    }

    // using linear search
    public static int[] twoSum(int[] numbers, int target) {
        int sum = 0;
        int i = 0;
        int j = 0;
        for (; i < numbers.length - 1; i++) {
            j = i + 1;
            for (; j < numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                if (sum == target)
                    return new int[] { i + 1, j + 1 };
            }
        }
        return numbers;
    }

    // optimized sol using two pointer approach

    public static int[] twoSumOptimized(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            if (numbers[start] + numbers[end] == target)
                break;
            if (numbers[start] + numbers[end] > target)
                end--;
            else
                start++;

        }
        return new int[] { start + 1, end + 1 };
    }

}
