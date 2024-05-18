import java.util.Arrays;

public class sol8 {
    // Q:Given the array nums, for each nums[i] find out how many numbers in the
    // array are smaller than it. That is, for each nums[i] you have to count the
    // number of valid j's such that j != i and nums[j] < nums[i].
    // Return the answer in an array.

    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    // brute force
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        // sort the array
        // index of nums will be their result
        int[] temp = nums.clone();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (temp[i] == nums[j]) {
                    temp[i] = j;
                    break;
                }
            }
        }
        return temp;
    }
}
