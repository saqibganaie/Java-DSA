public class practice1_LS {
    //
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6 };
        int[][] arr2D = {
                { 1, 2, 4 },
                { 2, 44, 1 },
                { 12, 41, 8 }
        };
        // System.out.println(linearSearch(arr, 3));
        String name = "Saqib";
        // System.out.println(lsString(name, 'q'));
        // System.out.println(lsInRange(arr, 6, 1, 4));
        // System.out.println(getMin(arr));
        System.out.println(search2D(arr2D, 44));
    }

    // liner search in array
    static int linearSearch(int[] arr, int key) {
        if (arr.length == 0)
            return -1;
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == key)
                return index;
            index++;
        }
        return -1;
    }

    // linear search in 2D array
    static String search2D(int[][] arr, int key) {
        int row = 0;
        int col = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (key == arr[i][j]) {
                    row = i;
                    col = j;
                }
            }
        }
        return row + "," + col;
    }

    // Linear search in string
    static int lsString(String str, char target) {
        if (str.length() == 0)
            return -1;
        int index = 0;
        while (index < str.length()) {
            if (target == str.charAt(index))
                return index;
            index++;
        }
        return index;
    }

    // searching in a range
    static int lsInRange(int[] arr, int key, int low, int high) {
        int index = low;
        if (arr.length == 0)
            return -1;
        while (index <= high) {
            if (key == arr[index])
                return index;
            index++;
        }
        return -1;
    }

    // finding min number
    static int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}