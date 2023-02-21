import java.util.Arrays;

public class sol3 {
    // Q: Given an array nums. We define a running sum of an array as runningSum[i]
    // = sum(nums[0]…nums[i]).
    // Return the running sum of nums
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(Arrays.toString(runningSum(arr)));

    }

    public static int[] runningSum(int[] nums) {
        for (int count = 1; count < nums.length; count++) {
            nums[count] += nums[count - 1];
        }
        return nums;
    }
}