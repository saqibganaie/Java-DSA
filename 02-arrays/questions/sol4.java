public class sol4 {
    // Q:You are given an m x n integer grid accounts where accounts[i][j] is the
    // amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​
    // bank. Return the wealth that the richest customer has.
    // A customer's wealth is the amount of money they have in all their bank
    // accounts. The richest customer is the customer that has the maximum wealth.

    public static void main(String[] args) {
        int[][] acc = { { 1, 2, 3 }, { 2, 5, 6 } };
        System.out.print(maximumWealth(acc));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > max)
                max = sum;
        }
        return max;
    }

}