import java.util.Scanner;

public class sol2 {
    // Q2. Check if number is Palindrome or not

    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number : ");
        num = in.nextInt();
        if (isPalindrome(num))
            System.out.println(num + " is a palindrome");
        else
            System.out.println(num + " is not a palindrome");
    }

    static boolean isPalindrome(int num) {
        int temp = num;
        int reverse = 0;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp /= 10;
        }
        return reverse == num;
    }
}
