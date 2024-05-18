import java.util.Scanner;
import java.util.Arrays;

public class practice2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];
        for (int index = 0; index < arr.length; index++) { // print using for loop
            arr[index] = in.nextInt();
        }
        for (int element : arr) { // print using for each loop, for each element of arr , print element
            System.out.print(element + " ");
        }
        System.out.println(Arrays.toString(arr)); // print using Arrays class
    }

}
