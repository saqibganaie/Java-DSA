import java.util.*;

public class File1 {
    // Q1. Union of two arrays
    // Union means resultant array containing unique elements after contcating two
    // arrays.
    public static void main(String[] args) {
        int[] arr1 = { 7, 3, 9 };
        int[] arr2 = { 6, 3, 9, 2, 9, 4 };
        HashSet<Integer> union = new HashSet<>();
        for (int num : arr1) {
            union.add(num);
        }
        for (int num : arr2) {
            union.add(num);
        }
        System.out.println(union);
    }
}
