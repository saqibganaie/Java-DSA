public class File3 {
    // Steps for solving problem using recursion
    // 1. Identify if you can break the problem into smaller problems
    // 2. Find the base condition i.e find recurrence relation.
    // 3. Visualize or Draw Recursive tree.
    // 4. About the tree :-
    // i) See the flow of functions, how they are getting in stack
    // ii) Identify the flow of left tree calls and right tree calls.
    // iii) See how the values of returned at each step. See where the function call
    // will come out. In the end you will come out of the main function.

    // * Remember to focus on these three things while solving using recursion
    // 1. Arguments
    // 2. return type
    // 3. function body
    // * There is repeated calculation in recursion so it is inefficient which can
    // be improved using dynamic programming.
    public static void main(String[] args) {
        // System.out.println(fib(6));
        int[] arr = { 1, 2, 3, 4, 5 };
        // System.out.println(binarySearch(arr, 4));
        System.out.println(recrusiveBS(arr, 6, 0, arr.length - 1));
    }

    // This is not tail recursion because the last statement is return and not the
    // recursion call.
    // fibonacci sequence with recursion
    static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    // binary search without recursion
    static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < key) {
                start = mid + 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // binary search with recursion
    static int recrusiveBS(int[] arr, int key, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (arr[mid] == key) {
            return mid;
        }
        if (arr[mid] < key) {
            return recrusiveBS(arr, key, mid + 1, end);
        }
        return recrusiveBS(arr, key, start, mid - 1);

    }
}
