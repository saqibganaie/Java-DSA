import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class practice5_ques {
    public static void main(String[] args) {
        int[] arr = { 1, 332, 15, 212, 113 };
        swap(arr, 0, 3);
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
        System.out.println(Arrays.toString(reverseArr(arr)));
    }

    // Q1. Swap elements in arr
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // Q2. Max element in arr
    static int max(int[] arr) {
        int maxElem = arr[0]; // if array is empty then we can also use Integer.MIN_VALUE, like this int
                              // maxElem = Integer.MIN_VALUE
        for (int count = 1; count < arr.length; count++) {
            if (arr[count] > maxElem)
                maxElem = arr[count];
        }
        return maxElem;
    }

    // Q3. Reverse arr
    static int[] reverseArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        return arr;
    }
}
