import java.lang.Math;
// Q: // We are playing the Guess Game. The game is as follows:
// I pick a number from 1 to n. You have to guess which number I picked.
// Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
// You call a pre-defined API int guess(int num), which returns three possible results:
// -1: Your guess is higher than the number I picked (i.e. num > pick).
// 1: Your guess is lower than the number I picked (i.e. num < pick).
// 0: your guess is equal to the number I picked (i.e. num == pick).
// Return the number that I picked.

public class sol2 {
    public static void main(String[] args) {
        int range = 10;
        System.out.println(guessNumber(range));
    }

    public static int guessNumber(int n) {
        int num = (int) (Math.random() * (n + 1));
        int start = 1;
        int end = n;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (guess(mid, num) == 0)
                break;
            if (guess(mid, num) == 1)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return mid;
    }

    public static int guess(int num, int target) {
        if (num > target)
            return -1;
        if (num < target)
            return 1;
        return 0;
    }
}