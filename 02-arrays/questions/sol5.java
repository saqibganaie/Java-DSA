import java.util.Arrays;

public class sol5 {
    // Q: Given the array nums consisting of 2n elements in the form
    // [x1,x2,...,xn,y1,y2,...,yn].
    // Return the array in the form [x1,y1,x2,y2,...,xn,yn].

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(shuffle(arr, 3)));
        System.out.println(Arrays.toString(shuffleOptimized(arr, 3)));
    }
    // O(n) space complexity

    public static int[] shuffle(int[] nums, int n) {
        int[] shuffledArr = new int[2 * n];
        for (int i = 0; i < n; i++) {
            shuffledArr[i * 2] = nums[i];
            shuffledArr[2 * i + 1] = nums[i + n];
        }
        return shuffledArr;
    }

    // O(1) space complexity
    public static int[] shuffleOptimized(int[] nums, int n) {
        int evenIndex = 0;
        int oddIndex = n;
        int max = 1001; // because upper limit for nums[i] is 1000
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0)
                nums[i] += max * (nums[evenIndex++] % max);
            else
                nums[i] += max * (nums[oddIndex++] % max);
        }
        for (int i = 0; i < 2 * n; i++) {
            nums[i] /= max;
        }

        return nums;
    }

}