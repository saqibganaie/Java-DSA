public class sol13 {
    // Q: Given a m x n matrix grid which is sorted in non-increasing order both
    // row-wise and column-wise, return the number of negative numbers in grid
    public static void main(String[] args) {
        int[][] mat = {
                { 4, 3, 2, -1 },
                { 3, 2, 1, -1 },
                { 1, 1, -1, -2 },
                { -1, -1, -2, -3 }
        };
        System.out.println(countNegatives(mat));
        System.out.println(countNegativesOptimized(mat));
    }

    // brute force approch
    public static int countNegatives(int[][] grid) {
        int countNeg = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0)
                    countNeg++;
            }
        }
        return countNeg;
    }

    // optimized
    public static int countNegativesOptimized(int[][] grid) {
        int row = 0;
        int col = grid[0].length - 1;
        int countNeg = 0;
        while (row < grid.length && col >= 0) {
            if (grid[row][col] < 0) {
                countNeg += grid.length - row;
                col--;
            } else
                row++;
        }
        return countNeg;
    }
}