import java.util.ArrayList;

public class PracticeQues {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 2 };
        // System.out.println(missingNumber(arr));
        // System.out.println(optimizedMissingNumber(arr));
        // System.out.println(findDisappearedNumbers(arr));
        System.out.println(findDuplicate(arr));
    }

    // Q1. Given an array nums containing n distinct numbers in the range [0, n],
    // return the only number in the range that is missing from the array.
    // brute force
    public static int missingNumber(int[] nums) {
        int size = nums.length;
        for (int i = 0; i <= size; i++) {
            boolean exists = false;
            for (int j = 0; j < size; j++) {
                if (i == nums[j]) {
                    exists = true;
                }
            }
            if (!exists) {
                return i;
            }
        }
        return -1;
    }

    // optimized solution
    public static int optimizedMissingNumber(int[] nums) {
        int size = nums.length;
        int count = 0;
        while (count < nums.length) {
            int correctIndex = nums[count];
            if (correctIndex != size && nums[count] != nums[correctIndex]) {
                swap(nums, count, correctIndex);
            } else {
                count++;
            }
        }

        for (int i = 0; i < size; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return size;
    }

    // swap function
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // Q2. Given an array nums of n integers where nums[i] is in the range [1, n],
    // return an array of all the integers in the range [1, n] that do not appear in
    // nums.
    // optimized
    public static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        int size = nums.length;
        ArrayList<Integer> ans = new ArrayList<Integer>(size);
        int count = 0;
        while (count < size) {
            int correctIndex = nums[count] - 1;
            if (correctIndex != size && nums[count] != nums[correctIndex]) {
                swap(nums, count, correctIndex);
            } else {
                count++;
            }
        }
        for (int i = 0; i < size; i++) {
            if (nums[i] != i + 1) {
                ans.add(i + 1);
            }
        }
        return ans;
    }

    // Q3.Given an array of integers nums containing n + 1 integers where each
    // integer is in the range [1, n] inclusive.

    // There is only one repeated number in nums, return this repeated number.

    // You must solve the problem without modifying the array nums and uses only
    // constant extra space.
    public static int findDuplicate(int[] nums) {
        int size = nums.length;
        int count = 0;
        while (count < size) {
            int correctIndex = nums[count] - 1;
            if (nums[count] != nums[correctIndex]) {
                swap(nums, count, correctIndex);
            } else {
                count++;
            }
        }
        return nums[size - 1];

    }
}
