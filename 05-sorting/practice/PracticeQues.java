import java.util.ArrayList;

public class PracticeQues {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 2 };
        // System.out.println(missingNumber(arr));
        // System.out.println(optimizedMissingNumber(arr));
        // System.out.println(findDisappearedNumbers(arr));
        System.out.println(findDuplicate(arr));
        System.out.println(findDuplicates(arr));
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

    // Q4(Medium). Given an integer array nums of length n where all the integers of
    // nums
    // are in the range [1, n] and each integer appears once or twice, return an
    // array of all the integers that appears twice.
    // You must write an algorithm that runs in O(n) time and uses only constant
    // extra space.
    public static ArrayList<Integer> findDuplicates(int[] nums) {
        int size = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        if (size == 1) {
            return ans;
        }
        int count = 0;
        while (count < size) {
            int correctIndex = nums[count] - 1;
            if (nums[count] != nums[correctIndex]) {
                swap(nums, count, correctIndex);
            } else {
                count++;
            }
        }

        for (int i = 0; i < size; i++) {
            if (nums[i] != i + 1) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }

    // Q5. You have a set of integers s, which originally contains all the numbers
    // from 1 to n. Unfortunately, due to some error, one of the numbers in s got
    // duplicated to another number in the set, which results in repetition of one
    // number and loss of another number.

    // You are given an integer array nums representing the data status of this set
    // after the error.

    // Find the number that occurs twice and the number that is missing and return
    // them in the form of an array.
    public static int[] findErrorNums(int[] nums) {
        int size = nums.length;
        int count = 0;
        int[] res = new int[2];
        while (count < size) {
            int correctIndex = nums[count] - 1;
            if (nums[count] != nums[correctIndex]) {
                swap(nums, count, correctIndex);
            } else {
                count++;
            }
        }
        for (int i = 0; i < size; i++) {
            if (nums[i] != i + 1) {
                res[0] = nums[i];
                res[1] = i + 1;
            }
        }
        return res;
    }

    // Q6(Hard). Given an unsorted integer array nums, return the smallest missing
    // positive integer.
    // You must implement an algorithm that runs in O(n) time and uses constant
    // extra space.

    public static int firstMissingPositive(int[] nums) {
        int size = nums.length;
        int count = 0;
        while (count < size) {
            if (nums[count] > 0 && nums[count] <= size) {
                int correctIndex = nums[count] - 1;
                if (nums[count] != nums[correctIndex]) {
                    swap(nums, count, correctIndex);
                } else {
                    count++;
                }
            } else {
                count++;
            }
        }
        for (int i = 0; i < size; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return size + 1;
    }

}
