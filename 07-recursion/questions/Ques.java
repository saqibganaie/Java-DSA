import javax.sound.midi.Receiver;

public class Ques {

    public static void main(String[] args) {
        // System.out.println(sum(6));
        // System.out.println(sumOfDig(1342));
        // System.out.println(prodOfDig(214));
        // System.out.println(reverse(124));
        System.out.println(countZeroes(1001001011, 0));

    }

    // Q6. Count zeroes(0) in a number
    public static int countZeroes(int num, int count) {
        int currDigit = num % 10;
        if (num == 0) {
            return count;
        }
        if (currDigit == 0) {
            return countZeroes(num / 10, ++count);
        }
        return countZeroes(num / 10, count);
    }

    // Q5. Reverse a number
    public static int reverse(int num) {
        if (num == 0) {
            return 0;
        }
        int currDigit = num % 10;
        int numLen = (int) Math.log10(num) + 1;
        return (currDigit * (int) Math.pow(10, numLen - 1)) + reverse((num / 10));
    }

    // Q4. Sum of digits
    public static int prodOfDig(int num) {
        if (num / 10 == 0) {
            return num;
        }
        return prodOfDig(num / 10) * (num % 10);
    }

    // Q3. Sum of digits
    public static int sumOfDig(int num) {
        if (num / 10 == 0) {
            return num;
        }
        return sumOfDig(num / 10) + (num % 10);
    }

    // Q2. Sum of n numbers
    public static int sum(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    // Q1. Factorial of a number.
    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    // utility functions
    public static int countDigits(int num) {
        int numLen = 0;
        while (num > 0) {
            numLen++;
            num /= 10;
        }
        return numLen;
    }

}
