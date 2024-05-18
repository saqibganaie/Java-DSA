public class sol3 {
    // Q: You are a product manager and currently leading a team to develop a new
    // product. Unfortunately, the latest version of your product fails the quality
    // check. Since each version is developed based on the previous version, all the
    // versions after a bad version are also bad.
    // Suppose you have n versions [1, 2, ..., n] and you want to find out the first
    // bad one, which causes all the following ones to be bad.
    // You are given an API bool isBadVersion(version) which returns whether version
    // is bad. Implement a function to find the first bad version. You should
    // minimize the number of calls to the API.

    public static void main(String[] args) {

    }

    // isBadVersion is an API provided by leetcode , it won't run here
    public static int firstBadVersion(int n) {
        if (n == 1)
            return 1;
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // if (isBadVersion(mid))
            // end = mid - 1;
            // else
            // start = mid + 1;
        }
        return start;
    }
}
