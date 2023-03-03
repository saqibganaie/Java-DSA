import java.util.ArrayList;
import java.util.Arrays;

public class sol16_med {

    // Q: Given an m x n integer matrix matrix, if an element is 0, set its entire
    // row and column to 0's.

    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setZeroes(matrix);
        for (int[] item : matrix) {
            System.out.println(Arrays.toString(item));
        }
    }

    // brute force
    public static void setZeroes(int[][] matrix) {
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for (int i = 0; i < rows.size(); i++) {
            for (int j = 0; j < n; j++) {
                matrix[rows.get(i)][j] = 0;
            }
        }

        for (int i = 0; i < cols.size(); i++) {
            for (int j = 0; j < m; j++) {
                matrix[j][cols.get(i)] = 0;
            }
        }
    }

}