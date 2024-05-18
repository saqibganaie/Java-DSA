public class sol1 {
    // Q: Given a non-negative integer x, return the square root of x rounded down
    // to the nearest integer. The returned integer should be non-negative as well.
    // You must not use any built-in exponent function or operator.
    // For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

    public static void main(String[] args) {
        int num = 4;
        System.out.println(mySqrt(num));
    }

    public static int mySqrt(int x) {
        int start = 1;
        int end = x / 2;
        if (x == 0 || x == 1)
            return x;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid > x / mid)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return end;
    }
}