public class sol15 {

    // Q:Given a square matrix mat, return the sum of the matrix diagonals.

    // Only include the sum of all the elements on the primary diagonal and all the
    // elements on the secondary diagonal that are not part of the primary diagonal.

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int size = mat.length;
        for (int row = 0, col = 0; row < size; row++, col++) {
            sum += mat[row][col] + mat[row][size - 1 - col];
        }
        return size % 2 == 0 ? sum : sum - mat[size / 2][size / 2];
    }

}