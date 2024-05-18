public class sol5 {
    // Q: Given a positive integer num, return true if num is a perfect square or
    // false otherwise.
    // A perfect square is an integer that is the square of an integer. In other
    // words, it is the product of some integer with itself.
    // You must not use any built-in library function, such as sqrt.

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }

    public static boolean isPerfectSquare(int num) {
        // take a mid from 0 to num / 2;
        // if mid * mid > num take left arr i.e end = mid - 1;
        // else if mid * mid < num take right arr i.e start = mid + 1;
        // else return true;
        if (num == 1)
            return true;
        int start = 0;
        int end = num / 2;
        while (start <= end) {
            double mid = start + (end - start) / 2;
            if (mid > num / mid)
                end = (int) mid - 1;
            else if (mid < num / mid)
                start = (int) mid + 1;
            else
                return true;
        }
        return false;
    }

}
