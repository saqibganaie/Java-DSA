import java.util.Arrays;

public class sol2 {
    // Q:Given an integer array nums of length n, you want to create an array ans of
    // length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n
    // (0-indexed).
    // Specifically, ans is the concatenation of two nums arrays.
    // Return the array ans.
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }

    public static int[] getConcatenation(int[] nums) {
        int numsLen = nums.length;
        int[] ans = new int[2 * numsLen];
        for (int count = 0; count < numsLen; count++) {
            ans[count] = ans[count + numsLen] = nums[count];
        }
        return ans;
    }
}
