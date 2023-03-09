import java.util.Arrays;

public class sol17_med {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(productExceptSelf(nums)));
        System.out.println(Arrays.toString(productExceptSelfOptimized(nums)));
    }

    // brute force

    public static int[] productExceptSelf(int[] nums) {
        int product = 1;
        int size = nums.length;
        int countZero = 0;
        for (int num : nums) {
            if (num != 0)
                product *= num;
            else
                countZero++;
        }
        if (countZero == 1) {
            for (int i = 0; i < size; i++) {
                if (nums[i] == 0)
                    nums[i] = product;
                else
                    nums[i] = 0;
            }
            return nums;
        } else if (countZero > 1) {
            for (int i = 0; i < size; i++) {
                nums[i] = 0;
            }
            return nums;
        }
        for (int i = 0; i < size; i++) {
            nums[i] = (int) (product * Math.pow(nums[i], -1));
        }
        return nums;

    }

    // optimized sol
    public static int[] productExceptSelfOptimized(int[] nums) {
        int size = nums.length;
        int[] rightProduct = new int[size];
        int[] leftProduct = new int[size];
        int product = 1;
        for (int i = 0; i < size; i++) {
            leftProduct[i] = product;
            product *= nums[i];
        }
        product = 1;
        for (int i = size - 1; i >= 0; i--) {
            rightProduct[i] = product;
            product *= nums[i];
        }
        for (int i = 0; i < size; i++) {
            nums[i] = leftProduct[i] * rightProduct[i];
        }
        return nums;
    }

}
