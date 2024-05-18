
import java.util.Arrays;

public class practice4_ques {
    public static void main(String[] args) {
        int[] arr = { 2, 12, 15, 34, 56, 74, 100 };
        // System.out.println(getCeil(arr, 44));
        // System.out.println(getFloor(arr, 44));
        // char[] letters = { 'c', 'f', 'j' };
        // System.out.println(nextGreatesLetter(letters, 'g'));
        // System.out.println(ans(arr, 100));

    }

    // Q : Ceiling of a number (ceiling of a num in arr means the smallest number in
    // array that is greater than target)
    public static int getCeil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        if (target > arr[end])
            return -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    // Q : floor of a number
    public static int getFloor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        if (target < arr[0])
            return -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    // Q: Find the smallest letter Greater than target
    public static char nextGreatesLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        if (target > letters[end])
            return letters[0];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > letters[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return letters[start];
    }

    // Q: Find element in an array of infinite size
    public static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        int newStart = 0;
        while (target > arr[end]) {
            newStart = end + 1;
            end = end + (end - start + 1) * 2;
        }
        return search(arr, target, newStart, end);
    }

    public static int search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target)
                end = mid - 1;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
