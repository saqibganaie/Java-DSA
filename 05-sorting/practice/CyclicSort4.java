import java.util.Arrays;

public class CyclicSort4 {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    // ** Cyclic sort is used for unsorted sequence which is from 1 to N
    // e.g = {2, 3, 1, 5 ,4} it has all the numbers from 1 to 5 so we will use
    // cyclic sort
    // * Time complexity - best case {O(n)}, worst case {O(n)}
    /*
     * Space complexity- O(1) i.e no extra space required a.k.a inplace sorting
     * algorithm
     */
    // * Working
    // 1. Check if element is at correct position by comapring it's value with the
    // index (i.e if arr[i] == i + 1 then it is at correct position)
    // 2. If it is then increment counter and move on.
    // 3. If it is not then swap the element with the otherElement at index
    // element - 1
    public static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    // swap function
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}