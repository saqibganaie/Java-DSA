public class sol7 {
    // Q: You are given an array of characters letters that is sorted in
    // non-decreasing order, and a character target. There are at least two
    // different characters in letters.
    // Return the smallest character in letters that is lexicographically greater
    // than target. If such a character does not exist, return the first character
    // in letters.
    public static void main(String[] args) {
        char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f' };
        System.out.println(nextGreatestLetter(letters, 'd'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        if (target >= letters[end])
            return letters[0];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return letters[start];
    }

}
