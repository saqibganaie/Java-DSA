import java.util.Arrays;
import java.util.ArrayList;

public class sol9 {
    // Q:Given two arrays of integers nums and index. Your task is to create target
    // array under the following rules:
    // Initially target array is empty.
    // From left to right read nums[i] and index[i], insert at index index[i] the
    // value nums[i] in target array.
    // Repeat the previous step until there are no elements to read in nums and
    // index.
    // Return the target array.

    // It is guaranteed that the insertion operations will be valid.

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        System.out.println(Arrays.toString(createTargetArray(nums, index)));

    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int size = nums.length;
        int[] target = new int[size];
        ArrayList<Integer> res = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            res.add(index[i], nums[i]);
        }
        for (int i = 0; i < size; i++) {
            target[i] = res.get(i);
        }

        return target;

    }
}