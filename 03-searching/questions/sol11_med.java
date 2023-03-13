public class sol11_med {
    // Q:You are given a sorted array consisting of only integers where every
    // element appears exactly twice, except for one element which appears exactly
    // once.
    // Return the single element that appears only once.
    // Your solution must run in O(log n) time and O(1) space.

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        System.out.println(singleNonDuplicate(arr));
    }

    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid % 2 == 1)
                mid--;
            if (nums[mid] != nums[mid + 1])
                end = mid;
            else
                start = mid + 2;
        }
        return nums[start];
    }
}
