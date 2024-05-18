import java.util.Arrays;

public class pracitce5_2DS {
    public static void main(String[] args) {
        int[][] mat = { { 18, 9, 12 }, { 36, -4, 91 }, { 44, 33, 16 } };
        int[][] sortedMat = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 28, 29, 37, 49 }, { 33, 34, 38, 50 } };
        int[][] strSortedMat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        // System.out.println(Arrays.toString(search2d(mat, 91)));
        // System.out.println(Arrays.toString(searchSortedMat(sortedMat, 37)));
        System.out.println(Arrays.toString(strictSortedMat(strSortedMat, 8)));
    }

    public static int[] search2d(int[][] mat, int key) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == key)
                    return new int[] { i, j };
            }
        }
        return new int[] { -1, -1 };
    }

    // searching in a not strictly sorted matrix
    public static int[] searchSortedMat(int[][] mat, int target) {
        int row = 0;
        int col = mat.length - 1;
        while (row < mat.length && col >= 0) {
            if (mat[row][col] == target)
                return new int[] { row, col };
            if (mat[row][col] > target)
                col--;
            else
                row++;
        }
        return new int[] { -1, -1 };
    }

    // binary search for strictly sorted matrix
    public static int[] binarySearch(int[][] mat, int target, int row, int colStart, int colEnd) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;
            if (mat[row][mid] == target)
                return new int[] { row, mid };
            if (mat[row][mid] < target)
                colStart = mid + 1;
            else
                colEnd = mid - 1;
        }
        return new int[] { -1, -1 };
    }

    // searching in strictly sorted matrix
    public static int[] strictSortedMat(int[][] mat, int target) {
        int row = mat.length;
        int col = mat[0].length;
        if (row == 1) {
            return binarySearch(mat, target, 0, 0, col - 1);
        }
        int rowStart = 0;
        int rowEnd = row - 1;
        int colMid = col / 2;
        while (rowStart < (rowEnd - 1)) { // while this is true it will have more than two rows
            int mid = rowStart + (rowEnd - rowStart) / 2;
            if (mat[mid][colMid] == target)
                return new int[] { mid, colMid };
            if (mat[mid][colMid] > target)
                rowEnd = mid;
            else
                rowStart = mid;
        }
        // if the above code did not return the now we have two rows
        // check wheather the target is in the middle col
        if (mat[rowStart][colMid] == target)
            return new int[] { rowStart, colMid };
        if (mat[rowStart + 1][colMid] == target)
            return new int[] { rowStart + 1, colMid };

        // now check in the four halfs

        // search in 1st half
        if (mat[rowStart][colMid - 1] >= target)
            return binarySearch(mat, target, rowStart, 0, colMid - 1);

        // search in 2nd half
        if (mat[rowStart][colMid + 1] <= target && mat[rowStart][col - 1] >= target)
            return binarySearch(mat, target, rowStart, colMid + 1, col - 1);

        // search in 3rd and 4th half
        if (mat[rowStart + 1][colMid - 1] >= target)
            return binarySearch(mat, target, rowStart + 1, 0, colMid - 1);
        else
            return binarySearch(mat, target, rowStart + 1, colMid + 1, col - 1);

    }
}