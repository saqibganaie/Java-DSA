import java.util.Arrays;

public class practice3 {
    // arrays are mutable in java and strings are immutable (mutable means something
    // can be changed)

    public static void main(String[] args) {
        // Multi Dimensional arrays
        int[][] arr = {
                { 1, 2, 3 },
                { 5, 12, 14, 15 },
                { 2 }
        };
        // for (int outerCount = 0; outerCount < arr.length; outerCount++) { // print
        // 2-D arrays using for loop
        // for (int innerCount = 0; innerCount < arr[outerCount].length; innerCount++) {
        // System.out.print(arr[outerCount][innerCount] + " ");
        // }
        // System.out.print("\n");
        // }
        for (int[] element : arr) { // print using forEach loop and Arrays class
            System.out.println(Arrays.toString(element));
        }
    }
}
