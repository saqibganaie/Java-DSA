import java.util.Arrays;

public class practice2_ques {
    public static void main(String[] args) {

        // for Q1
        // int[] arr = { 11, 211, 32, 234, 1112, 12, 11, 111, 153423 };
        // System.out.println(findNums_evenDig(arr));

        // for Q2
        int[][] accounts = {
                { 1, 2, 34, 12 },
                { 12, 14, 15, 1 },
                { 1, 11, 15, 113 }
        };
        System.out.println(getMaxWealth(accounts));
    }

    // Q1: how many numbers contain even digits
    static int findNums_evenDig(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (countDigOptimized(arr[i]) % 2 == 0)
                res++;
        }
        return res;
    }

    // brute force count digits
    static int countDig(int num) {
        if (num < 0)
            num = num * -1;
        if (num == 0)
            return 1;
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }

    // optimized count digits
    static int countDigOptimized(int num) {
        if (num < 0)
            num = num * -1;
        return (int) Math.log10(num) + 1; // all the log of all the two digit numbers lie between 1 to 1.99 and three
                                          // digit numbers lie between 2 to 2.99 and so on
    }

    // Q2: find max wealth
    static int getMaxWealth(int[][] arr) {
        int maxWealth = Integer.MIN_VALUE;
        for (int[] account : arr) {
            int currWealth = 0;
            for (int money : account) {
                currWealth += money;
            }
            if (currWealth > maxWealth)
                maxWealth = currWealth;
        }
        return maxWealth;
    }
}
