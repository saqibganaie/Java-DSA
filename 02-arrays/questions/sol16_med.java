import java.util.ArrayList;
import java.util.Arrays;

public class sol16_med {

    // Q: Given an m x n integer matrix matrix, if an element is 0, set its entire
    // row and column to 0's.

    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setZeroesOptimal(matrix);
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

    // optimal sol with space complexity O(1) and time complexity O(m*n)
    public static void setZeroesOptimal(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean isRow0 = false;
        boolean isCol0 = false;
        // check for 0's in 0th row
        for (int col = 0; col < n; col++) {
            if (matrix[0][col] == 0)
                isRow0 = true;
        }
        // check for 0's in 0th column
        for (int row = 0; row < m; row++) {
            if (matrix[row][0] == 0)
                isCol0 = true;
        }
        // check for 0 valued elements in the m-1 x n-1 matrix and make their
        // coresponding 0th row and 0th col element to 0.
        for (int row = 1; row < m; row++) {
            for (int col = 1; col < n; col++) {
                if (matrix[row][col] == 0) {
                    matrix[0][col] = 0;
                    matrix[row][0] = 0;
                }
            }
        }
        // now check for 0 valued elements in 0th row and 0th col and make their entire
        // row and col elements to 0
        for (int row = 1; row < m; row++) {
            for (int col = 1; col < n; col++) {
                if (matrix[0][col] == 0 || matrix[row][0] == 0)
                    matrix[row][col] = 0;
            }
        }

        // now if isRow0 or isCol0 are true then make their entire elements 0.
        if (isRow0) {
            for (int col = 0; col < n; col++) {
                matrix[0][col] = 0;
            }
        }
        if (isCol0) {
            for (int row = 0; row < m; row++) {
                matrix[row][0] = 0;
            }
        }
    }

}