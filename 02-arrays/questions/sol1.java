import java.util.Arrays;

public class sol1 {
    // Q: Given a zero-based permutation nums (0-indexed), build an array ans of
    // the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length
    // and return it.
    // A zero-based permutation nums is an array of distinct integers from 0 to
    // nums.length - 1 (inclusive).

    public static void main(String[] args) {
        int[] arr = { 5, 0, 1, 2, 3, 4 };
        System.out.println(Arrays.toString(buildArray(arr)));
    }

    // brute force
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int count = 0; count < nums.length; count++) {
            ans[count] = nums[nums[count]];
        }
        return ans;
    }

    // optimized in O(1) space complexity
    public static int[] buildArrayOptimized(int[] nums) {
        int numsLen = nums.length;
        for (int i = 0; i < numsLen; i++) {
            nums[i] += numsLen * (nums[nums[i]] % numsLen); // modulo retains the old value of element when we are
                                                            // calculating the further values.
        }
        for (int i = 0; i < numsLen; i++) {
            nums[i] /= numsLen;
        }
        return nums;
    }
}