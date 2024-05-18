public class sol10 {
    // Q:A pangram is a sentence where every letter of the English alphabet appears
    // at least once.
    // Given a string sentence containing only lowercase English letters, return
    // true if sentence is a pangram, or false otherwise.

    public static void main(String[] args) {
        System.out.println(checkIfPangram("abcdefghijklmnopqrstuvwxyz"));
    }

    public static boolean checkIfPangram(String sentence) {
        boolean[] check = new boolean[26];
        int size = sentence.length();
        for (int i = 0; i < size; i++) {
            int index = sentence.charAt(i);
            check[index - 97] = true;
        }
        for (boolean value : check) {
            if (!value)
                return false;
        }
        return true;
    }
}