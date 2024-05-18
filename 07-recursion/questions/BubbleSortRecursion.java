import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr = { 1, 10, 2, 13, 11, 9, 8, 6 };
        System.out.println(Arrays.toString(arr));
        rBSort(arr, arr.length, 0);
        System.out.println(Arrays.toString(arr));

    }

    // Recursive Bubble sort
    public static void rBSort(int[] arr, int currLength, int index) {
        if (currLength == 0) {
            return;
        }
        if (index < currLength - 1) {
            if (arr[index] > arr[index + 1]) {
                int temp = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = temp;
            }
            rBSort(arr, currLength, index + 1);
        } else {
            rBSort(arr, currLength - 1, 0);
        }
    }

    // Normal bubble Sort
    public static void bSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
