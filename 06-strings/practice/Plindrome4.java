import java.util.Scanner;

public class Plindrome4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = new String();
        System.out.print("Enter your string : ");
        inputStr = in.next();
        System.out.println(ifPalindrome(inputStr));
    }

    public static boolean ifPalindrome(String inputStr) {
        int strLen = inputStr.length();
        if (inputStr == null || strLen == 0) {
            return true;
        }
        String tempStr = inputStr.toLowerCase(); // to make the program case
        // insensitive
        for (int i = 0; i <= strLen / 2; i++) {
            char start = tempStr.charAt(i);
            char end = tempStr.charAt(strLen - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }

}
