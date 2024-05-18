public class practice3_BS {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(binarySearch(arr, 2));
        int[] arr2 = { 5, 4, 3, 2, 1 };
        System.out.println(binarySearchOrderAgnostic(arr2, 2));
    }

    // using loop/iteration
    public static int binarySearch(int[] arr, int key) {
        // mid = low + high / 2;
        // if (mid == key) return true;
        // if (key > mid) search right array of size n / 2;
        // else search left arr of size n / 2
        // repeat till you find the key;
        // int mid = (low + high) / 2; // in java if low + high is very large then it
        // may exceed the integer limit so a better way to do it is written below
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; // here start is already in range and end - start will obviously in
                                                 // range
            if (arr[mid] == key)
                return mid;
            if (key > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;

    }

    // using recursion
    public static int binarySearchRecursive(int[] arr, int key, int low, int high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == key)
            return mid;
        if (key > arr[mid])
            return binarySearchRecursive(arr, key, mid + 1, high);
        else
            return binarySearchRecursive(arr, key, low, mid - 1);
    }

    // binary search if we dont know wheather the order is in ascending or decending
    public static int binarySearchOrderAgnostic(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key)
                return mid;

            if (isAscending) {
                if (key > arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            } else {
                if (key < arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;

    }

}
