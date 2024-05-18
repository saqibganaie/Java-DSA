public class sol14 {

    // Q:There is an m x n matrix that is initialized to all 0's. There is also a 2D
    // array indices where each indices[i] = [ri, ci] represents a 0-indexed
    // location to perform some increment operations on the matrix.

    // For each location indices[i], do both of the following:

    // Increment all the cells on row ri.
    // Increment all the cells on column ci.
    // Given m, n, and indices, return the number of odd-valued cells in the matrix
    // after applying the increment to all locations in indices.

    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {
                { 0, 1 },
                { 1, 1 }
        };
        System.out.println(oddCells(m, n, indices));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int countOdds = 0;
        int[] row = new int[m];
        int[] col = new int[n];
        for (int[] item : indices) {
            row[item[0]]++;
            col[item[1]]++;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                countOdds += (row[i] + col[j]) % 2;
            }
        }
        return countOdds;
    }

}