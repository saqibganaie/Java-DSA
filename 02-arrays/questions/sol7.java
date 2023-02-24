import java.util.Arrays;

public class sol7 {
    // Q: Given an array of integers nums, return the number of good pairs.
    // A pair (i, j) is called good if nums[i] == nums[j] and i < j.

    public static void main(String[] args) {
        int[] arr = { 1, 2, 6, 9, 2, 4, 3 };
        System.out.println(numIdenticalPairs(arr));
        System.out.println(numIdenticalPairsOptimized(arr));
    }

    // brute force O(n^2) time complexity
    public static int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    goodPairs++;
            }
        }
        return goodPairs;
    }

    // optimized sol O(nlogn) time complexity
    public static int numIdenticalPairsOptimized(int[] nums) {
        int goodPairs = 0;
        int similarNums = 1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1 && nums[i] == nums[i + 1])
                similarNums++;
            else {
                goodPairs += (similarNums * (similarNums - 1)) / 2;
                similarNums = 1;
            }
        }
        return goodPairs;
    }
}