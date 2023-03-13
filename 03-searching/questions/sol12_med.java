public class sol12_med {
    // Q: There is an integer array nums sorted in ascending order (with distinct
    // values).
    // Prior to being passed to your function, nums is possibly rotated at an
    // unknown pivot index k (1 <= k < nums.length) such that the resulting array is
    // [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
    // (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3
    // and become [4,5,6,7,0,1,2].
    // Given the array nums after the possible rotation and an integer target,
    // return the index of target if it is in nums, or -1 if it is not in nums.
    // You must write an algorithm with O(log n) runtime complexity.
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(search(arr, 0));
    }

    public static int search(int[] nums, int target) {
        int pivotIndex = getPivotIndex(nums);
        int res = -1;
        res = binarySearch(nums, target, 0, pivotIndex);
        if (res == -1)
            res = binarySearch(nums, target, pivotIndex + 1, nums.length - 1);
        return res;

    }

    public static int getPivotIndex(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        if (end == 0)
            return 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= nums[0])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return end;
    }

    public static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

}