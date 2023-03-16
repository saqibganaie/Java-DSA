import java.util.Arrays;
import java.util.ArrayList;

public class sol14 {

    // Q:Given two integer arrays nums1 and nums2, return an array of their
    // intersection. Each element in the result must be unique and you may return
    // the result in any order.
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> commonElem = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            int target = nums1[i];
            if (i != nums1.length - 1 && target == nums1[i + 1])
                continue;
            int start = 0;
            int end = nums2.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (nums2[mid] == target) {
                    commonElem.add(target);
                    break;
                }
                if (nums2[mid] > target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        int[] ans = new int[commonElem.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = commonElem.get(i);
        }
        return ans;
    }
}